package J4V4.flippingBits;

public class Main {

    public static long flippingBits(long n) {
        long MAX_32BIT_INT = (long) Math.pow(2, 32) - 1; // Calculate the maximum value of a 32 bits integer
        return n ^ MAX_32BIT_INT;
    }

    public static void main(String[] args) {
        long n = 9;
        System.out.println(flippingBits(n));
    }
}
