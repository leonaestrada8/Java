package Coliseum.J4V4.Binary;

import java.util.Arrays;

class Pair {
    int value;
    int index;

    public Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

public class BinarySearch {

    public static int binary(int[] arr, int x) {
        int right = arr.length - 1;
        int left = 0;
        int mid = 0;
        Pair[] indexed_arr = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            indexed_arr[i] = new Pair(arr[i], i);
        }
        Arrays.sort(indexed_arr, (a, b) -> a.value - b.value);
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (indexed_arr[mid].value == x) {
                return indexed_arr[mid].index;
            } else if (indexed_arr[mid].value > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 3, 2, 1, 15, 10, 77, 88, 99, 42, 35, 21, 8, 12, 13 };
        int x = 13;

        // Chamando a função
        int result = binary(arr, x);

        if (result != -1) {
            System.out.println("Elemento encontrado no índice " + result);
        } else {
            System.out.println("Elemento não encontrado na matriz");
        }
    }
}
