package J4V4.PlusMinus;

public class Main {

    public static void plusMinus(int[] arr) {
        double n = arr.length;
        double positives = 0;
        double negatives = 0;
        double zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positives += 1;
            } else if (arr[i] < 0) {
                negatives += 1;
            } else {
                zeros += 1;
            }
        }
        System.out.printf("POSITIVES: %.6f\n", positives / n);
        System.out.printf("NEGATIVES: %.6f\n", negatives / n);
        System.out.printf("ZEROS: %.6f\n", zeros / n);
    }

    public static void main(String[] args) {
        // Example of an array of integers
        int[] arr = { -4, 3, -9, 0, 4, 1 };

        plusMinus(arr);
    }
}
