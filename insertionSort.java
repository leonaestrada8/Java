package Coliseum.J4V4.insertionSort;

public class insertionSort {
    public static int[] insertionSort2(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j -= 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 4, 5, 6, 3, 1, 2 };
        insertionSort2(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
