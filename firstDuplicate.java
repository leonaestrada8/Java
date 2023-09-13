package J4V4.firstDuplicate;

import java.util.HashSet;

public class Main {

    static int firstDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            // If the number is already in the set, return it
            if (seen.contains(num)) {
                return num;
            }
            // Otherwise, add the number to the set
            else {
                seen.add(num);
            }
        }
        // If no duplicates are found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 3, 2 };

        System.out.println(firstDuplicate(arr)); // Should print 3
    }
}
