package Final.J4V4.Cambio13;

import java.util.Scanner;

public class ConversorDeMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo taxas de câmbio fixas
        double usdParaBrl = 5.2;
        double eurParaBrl = 6.1;
        double usdParaEur = eurParaBrl / usdParaBrl;

        System.out.println("Informe o valor a ser convertido:");
        double valor = scanner.nextDouble();

        System.out.println("Informe a moeda de origem (USD, EUR, BRL):");
        String moedaOrigem = scanner.next().toUpperCase();

        System.out.println("Informe a moeda de destino (USD, EUR, BRL):");
        String moedaDestino = scanner.next().toUpperCase();

        double valorConvertido = 0.0;

        // Convertendo o valor de acordo com as moedas selecionadas
        if (moedaOrigem.equals("USD") && moedaDestino.equals("BRL")) {
            valorConvertido = valor * usdParaBrl;
        } else if (moedaOrigem.equals("USD") && moedaDestino.equals("EUR")) {
            valorConvertido = valor * usdParaEur;
        } else if (moedaOrigem.equals("EUR") && moedaDestino.equals("BRL")) {
            valorConvertido = valor * eurParaBrl;
        } else if (moedaOrigem.equals("EUR") && moedaDestino.equals("USD")) {
            valorConvertido = valor / usdParaEur;
        } else if (moedaOrigem.equals("BRL") && moedaDestino.equals("USD")) {
            valorConvertido = valor / usdParaBrl;
        } else if (moedaOrigem.equals("BRL") && moedaDestino.equals("EUR")) {
            valorConvertido = valor / eurParaBrl;
        }

        System.out.println("Valor convertido: " + moedaDestino + " " + valorConvertido);

        scanner.close();
    }
}
