package J4V4.xorString;

public class Main {

    public static String stringsXor(String s, String t) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                res.append('0');
            } else {
                res.append('1');
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "10101";
        String t = "00101";
        System.out.println(stringsXor(s, t));
    }

}
