package J4V4.Birthday;

import java.util.*;

public class Main {

    public static int birthday(List<Integer> s, int d, int m) {
        int ways = 0;
        int sum_squares = 0;

        for (int i = 0; i < m; i++) {
            sum_squares += s.get(i);
        }

        if (sum_squares == d) {
            ways++;
        }

        for (int i = m; i < s.size(); i++) {
            sum_squares = sum_squares - s.get(i - m) + s.get(i);
            if (sum_squares == d) {
                ways++;
            }
        }

        return ways;
    }

    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(2, 2, 1, 3, 2);
        int d = 4;
        int m = 2;
        System.out.println(birthday(s, d, m)); // Outputs: 2
    }
}
