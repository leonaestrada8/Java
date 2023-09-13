package J4V4.twoArrays;

import java.util.Arrays;

public class Main {

    public static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A); // Sort A in ascending order

        // Sort B in ascending order and then reverse it
        Arrays.sort(B);
        for (int i = 0, j = B.length - 1; i < j; i++, j--) {
            int temp = B[i];
            B[i] = B[j];
            B[j] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println("checking: .... " + A[i] + " + " + B[i] + " = " + (A[i] + B[i]) + " < " + k + " ???");
            if (A[i] + B[i] < k) { // If any pair doesn't satisfy the condition, return "NO"
                System.out.println("FAILED " + A[i] + " + " + B[i] + " = " + (A[i] + B[i]) + " < " + k + " !!!");
                return "NO";
            }
        }
        return "YES"; // If all pairs satisfy the condition, return "YES"
    }

    public static void main(String[] args) {
        int k = 32;
        int[] A = { 0, 1, 5, 7, 8, 42, 20, 77, 99 };
        int[] B = { 0, 2, 88, 5, 40, 25, 66, 15, 11 };
        System.out.println(twoArrays(k, A, B)); // returns "YES"
    }
}
