package J4V4.rotateImage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Reverse the matrix
        List<int[]> list = Arrays.asList(a);
        Collections.reverse(list);
        a = list.toArray(new int[0][]);

        // Transpose the matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Print the result
        for (int[] row : a) {
            System.out.println(Arrays.toString(row));
        }
    }
}
