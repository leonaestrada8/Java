package Final.J4V4.Cinema21;

import java.util.Scanner;

public class Cinema {

    static class Filme {
        String nome;
        double preco;

        Filme(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }

    static class Sala {
        String nome;
        String[][] assentos;

        Sala(String nome, int rows, int cols) {
            this.nome = nome;
            this.assentos = new String[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    assentos[i][j] = "Livre";
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme[] filmes = { new Filme("Movie 1", 10), new Filme("Movie 2", 12) };
        Sala[] salas = { new Sala("Sala 1", 5, 10), new Sala("Sala 2", 5, 10) };

        System.out.println("Filmes em Cartaz:");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + ". " + filmes[i].nome + " - $" + filmes[i].preco);
        }

        System.out.print("Selecione o filme: ");
        int filmeSelecionado = scanner.nextInt() - 1;

        System.out.println("Salas Disponíveis:");
        for (int i = 0; i < salas.length; i++) {
            System.out.println((i + 1) + ". " + salas[i].nome);
        }

        System.out.print("Selecione a sala: ");
        int salaSelecionada = scanner.nextInt() - 1;

        Sala sala = salas[salaSelecionada];
        System.out.println("Assentos:");
        for (int i = 0; i < sala.assentos.length; i++) {
            for (int j = 0; j < sala.assentos[0].length; j++) {
                System.out.print(sala.assentos[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.print("Selecione a fileira: ");
        int row = scanner.nextInt() - 1;
        System.out.print("Selecione a coluna: ");
        int col = scanner.nextInt() - 1;

        if (sala.assentos[row][col].equals("Livre")) {
            sala.assentos[row][col] = "Ocupado";
            double precoTotal = filmes[filmeSelecionado].preco;
            System.out.println("Ingresso reservado. Preço Total: $" + precoTotal);
        } else {
            System.out.println("Assento já ocupado!");
        }

        scanner.close();
    }
}
