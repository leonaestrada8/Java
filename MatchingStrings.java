package J4V4.MatchingStrings;

import java.util.*;

public class Main {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> res = new ArrayList<>();
        for (String q : queries) {
            res.add(Collections.frequency(strings, q));
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Luke", "Leia", "Han", "Chewbacca", "Vader", "Yoda", "R2-D2", "C-3PO",
                "Boba Fett", "Lando", "Obi-Wan", "Anakin", "Padme", "Mace Windu", "Palpatine", "Yoda", "Obi-Wan",
                "Yoda", "Obi-Wan", "Vader", "Vader", "Vader");
        List<String> queries = Arrays.asList("Yoda", "Vader", "Anakin", "Obi-Wan", "Han", "Leia");

        List<Integer> res = matchingStrings(strings, queries);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(queries.get(i) + " - " + res.get(i));
        }
    }
}
