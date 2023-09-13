package Final.J4V4.Logs33;

//3.3 Logs

public class LogAnalyzer {
    private String[] logs;

    public LogAnalyzer(String[] logs) {
        this.logs = logs;
    }

    public String[] filterCriticalEvents() {
        return java.util.Arrays.stream(logs)
                .filter(log -> log.startsWith("CRITICAL"))
                .toArray(String[]::new);
    }

    public void generateReport() {
        String[] criticalEvents = filterCriticalEvents();

        if (criticalEvents.length == 0) {
            System.out.println("Nenhum evento crítico encontrado.");
            return;
        }

        System.out.println("Relatório de Eventos Críticos:");
        for (String event : criticalEvents) {
            System.out.println(event);
        }
    }

    public static void main(String[] args) {
        String[] logs = {
                "INFO: Usuário logado com sucesso.",
                "CRITICAL: Falha na base de dados.",
                "INFO: Arquivo atualizado.",
                "WARNING: Tentativa de acesso não autorizado.",
                "CRITICAL: Sistema de arquivos corrompido."
        };

        LogAnalyzer analyzer = new LogAnalyzer(logs);
        analyzer.generateReport();
    }
}
