package Coliseum.J4V4.ALUNOS12_1;

import java.util.Arrays;
import java.util.Scanner;

public class EstatisticasDaTurma {
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        return media;
    }

    public static double calcular_mediana(double[] notas) {
        double[] notas_ordenadas = Arrays.copyOf(notas, notas.length);
        Arrays.sort(notas_ordenadas);
        int meio = notas.length / 2;
        double mediana;
        if (notas.length % 2 == 0) {
            mediana = (notas[meio - 1] + notas[meio]) / 2;
        } else {
            mediana = notas[meio];
        }
        return mediana;
    }

    public static double calcular_desvio_padrao(double[] notas, double media) {
        double soma_diferenca_quadradas = 0;
        for (double nota : notas) {
            soma_diferenca_quadradas += Math.pow(nota - media, 2);
        }
        double variancia = soma_diferenca_quadradas / notas.length;
        double desvio_padrao = Math.sqrt(variancia);
        return desvio_padrao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de alunos?");
        int numeroDeAlunos = scanner.nextInt();
        double[] notas = new double[numeroDeAlunos];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do aluno " + (i + 1) + "? ");
            notas[i] = scanner.nextFloat();
        }

        double media = calcularMedia(notas);
        double mediana = calcular_mediana(notas);
        double desvio_padrao = calcular_desvio_padrao(notas, media);

        System.out.println("MEDIA:" + String.format("%.2f", media));
        System.out.println("MEDIANA:" + String.format("%.2f", mediana));
        System.out.println("DESVIO PADRAO:" + String.format("%.2f", desvio_padrao));

        scanner.close();

    }

}
