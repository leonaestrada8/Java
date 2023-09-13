package Final.J4V4.Visitas52;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class AnaliseTrafegoSite {
    static class Visita {
        String visitorId;
        String page;
        int duration;

        public Visita(String visitorId, String page, int duration) {
            this.visitorId = visitorId;
            this.page = page;
            this.duration = duration;
        }
    }

    public static void main(String[] args) {
        ArrayList<Visita> dadosVisitas = new ArrayList<>();
        dadosVisitas.add(new Visita("v1", "/home", 5));
        dadosVisitas.add(new Visita("v1", "/contact", 2));
        dadosVisitas.add(new Visita("v2", "/home", 3));
        dadosVisitas.add(new Visita("v3", "/products", 8));
        dadosVisitas.add(new Visita("v3", "/home", 2));

        // Análise de visitantes únicos
        HashSet<String> visitantesUnicos = new HashSet<>();
        for (Visita visita : dadosVisitas) {
            visitantesUnicos.add(visita.visitorId);
        }
        System.out.println("Visitantes únicos: " + visitantesUnicos.size());

        // Análise de páginas mais visitadas
        HashMap<String, Integer> paginasVisitas = new HashMap<>();
        for (Visita visita : dadosVisitas) {
            paginasVisitas.put(visita.page, paginasVisitas.getOrDefault(visita.page, 0) + 1);
        }
        String paginaMaisVisitada = paginasVisitas.keySet().stream()
                .max((a, b) -> paginasVisitas.get(a) - paginasVisitas.get(b)).get();
        System.out.println("Página mais visitada: " + paginaMaisVisitada + " (" + paginasVisitas.get(paginaMaisVisitada)
                + " visitas)");

        // Análise da duração média da visita
        int duracaoTotal = dadosVisitas.stream().mapToInt(visita -> visita.duration).sum();
        double duracaoMedia = (double) duracaoTotal / dadosVisitas.size();
        System.out.printf("Duração média da visita: %.2f minutos%n", duracaoMedia);
    }
}
