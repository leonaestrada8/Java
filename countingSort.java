package J4V4.countingSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 2, 1 };
        System.out.println(Arrays.toString(countingSort(arr)));
    }

    public static int[] countingSort(int[] arr) {
        int[] result = new int[100];
        for (int num : arr) {
            result[num]++;
        }
        return result;
    }
}
