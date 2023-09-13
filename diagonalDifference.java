package J4V4.diagonalDifference;

public class Main {

    public static int diagonalDifference(int[][] arr) {
        int diag1 = 0, diag2 = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            diag1 += arr[i][i];
            diag2 += arr[i][n - i - 1];
        }

        return Math.abs(diag1 - diag2);
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 9, 8, 9 }
        };
        System.out.println(diagonalDifference(arr));
    }

}
