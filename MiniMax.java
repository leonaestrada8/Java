package J4V4.MiniMax;

import java.util.*;

public class Main {
    public static void miniMaxSum(int[] arr) {

        int maior = Arrays.stream(arr).max().getAsInt();
        int menor = Arrays.stream(arr).min().getAsInt();
        long soma = Arrays.stream(arr).asLongStream().sum();

        System.out.println("Arr: " + Arrays.toString(arr));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Menor soma: " + (soma - maior));
        System.out.println("Maior soma: " + (soma - menor));
    }

    public static void main(String[] args) {
        // Testing
        int[] arr = { -4, 3, -9, 0, 4, 1 };
        miniMaxSum(arr);
    }
}
