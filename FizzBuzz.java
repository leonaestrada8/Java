package J4V4.FizzBuzz;

public class FizzBuzz {
    public static void minha_funcao(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz: " + i);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        minha_funcao(100);
    }
}
