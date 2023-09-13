package J4V4.TimeConversion;

public class Main {
    public static String timeConversion(String s) {
        String[] time = s.split(":");
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0, 2);
        String period = time[2].substring(2, 4);

        int h = Integer.parseInt(hours);

        if (period.equalsIgnoreCase("PM") && h != 12) {
            h += 12;
            hours = Integer.toString(h);
        } else if (period.equalsIgnoreCase("AM") && h == 12) {
            hours = "00";
        }

        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:00:00AM"));
        System.out.println(timeConversion("12:00:00PM"));
        System.out.println(timeConversion("04:20:00PM"));
    }
}
