// Distância 2.2
package Final.J4V4.DistanciaGeografica31;

import java.util.Scanner;
import java.util.ArrayList;

class Ponto {
    double x;
    double y;

    Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class DistanciaGeografica {
    public static double calcularDistancia(Ponto a, Ponto b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ponto> pontos = new ArrayList<>();

        System.out.print("Informe o número de pontos: ");
        int numeroDePontos = scanner.nextInt();

        for (int i = 0; i < numeroDePontos; i++) {
            System.out.print("Informe a coordenada X do ponto " + (i + 1) + ": ");
            double x = scanner.nextDouble();
            System.out.print("Informe a coordenada Y do ponto " + (i + 1) + ": ");
            double y = scanner.nextDouble();
            pontos.add(new Ponto(x, y));
        }

        double distanciaTotal = 0;
        for (int i = 0; i < pontos.size() - 1; i++) {
            Ponto pontoAtual = pontos.get(i);
            Ponto proximoPonto = pontos.get(i + 1);
            double distancia = calcularDistancia(pontoAtual, proximoPonto);
            System.out.println("Distância do ponto " + (i + 1) + " ao ponto " + (i + 2) + ": " + distancia);
            distanciaTotal += distancia;
        }

        System.out.println("Distância total percorrida: " + distanciaTotal);
        scanner.close();
    }
}
