package J4V4.segundoMaior;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int segundoMaior(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Integer[] uniqueNums = set.toArray(new Integer[0]);
        Arrays.sort(uniqueNums);

        return uniqueNums[uniqueNums.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 6, 5 };
        System.out.println(segundoMaior(arr)); // Output: 5
    }
}
