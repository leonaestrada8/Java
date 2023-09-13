package J4V4.Palindromo;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindromo("Anilina")); // Outputs: N
    }

    public static String palindromo(String palavra) {
        // Verifica se a palavra tem menos de 3 caracteres
        if (palavra.length() < 3) {
            return "?";
        }

        // Converte a palavra para minúsculas para lidar com palavras que têm letras
        // maiúsculas e minúsculas
        palavra = palavra.toLowerCase();

        String contrario = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            contrario += palavra.charAt(i);
        }

        // Verifica se a palavra é um palíndromo
        if (palavra.equals(contrario)) {
            return "S";
        } else {
            return "N";
        }

        /*
         * // Verifica se a palavra é um palíndromo
         * for (int i = 0; i < palavra.length() / 2; i++) {
         * if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
         * return "N";
         * }
         * }
         * 
         * return "S";
         */
    }
}
