package J4V4.Pangram;

import java.util.*;

public class Main {
    public static String pangrams(String s) {
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            alphabet.remove(c);
        }

        if (alphabet.isEmpty()) {
            return "pangram";
        } else {
            System.out.println(alphabet);
            return "not pangram";
        }
    }

    public static void main(String[] args) {
        System.out.println(pangrams("The quick brown fox jumps over a lazy dog."));
        System.out.println(pangrams("Pack my box with five dozen liquor jugs."));
        System.out.println(pangrams("Mr. Jock, TV quiz PhD., bags few lynx."));
        System.out.println(pangrams(
                "The problem with the world is that the intelligent people are full of doubts, while the stupid ones are full of confidence."));
    }
}
