package J4V4.lonelyInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static int findUnique(ArrayList<Integer> list) { /* SOLUTION I: O(n^2) */
        for (Integer num : list) {
            if (Collections.frequency(list, num) == 1) {
                return num;
            }
        }
        return -1; // Return -1 if no unique element is found
    }

    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 3, 7, 3, 2, 1 };
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr));

        Integer[] arr2 = { 1, 2, 3, 4, 3, 2, 1, 4, 42, 7, 8, 7, 8, 9, 10, 9, 10, 11, 11 };
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(arr2));

        System.out.println(findUnique(A)); // Outputs: 7
        System.out.println(findUnique(B)); // Outputs: 42
    }

    /*
     * public static int findUnique(int[] arr) { SOLUTION II: O(n)
     * HashMap<Integer, Integer> countMap = new HashMap<>();
     * for (int num : arr) {
     * if (countMap.containsKey(num)) {
     * countMap.put(num, countMap.get(num) + 1);
     * } else {
     * countMap.put(num, 1);
     * }
     * }
     * 
     * for (int num : arr) {
     * if (countMap.get(num) == 1) {
     * return num;
     * }
     * }
     * return -1; // Return -1 if no unique element is found
     * }
     */

}
