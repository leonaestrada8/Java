package J4V4.Prime;

public class Main {
    public static void prime(int n) {
        boolean prime;
        prime = true;
        for (int i = 2; i < 10; i++) {
            System.out.println(i);
            if ((n % i == 0) && (n != i)) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.printf("------------------- %d is PRIME\n", n);
        } else {
            System.out.printf("====== %d is NOT prime\n", n);
        }
    }

    public static void main(String[] args) {
        prime(7);
        prime(42);
    }
}
