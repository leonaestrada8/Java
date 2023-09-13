package Coliseum.J4V4.Fibonacci;

import java.util.ArrayList;

public class fibo {
    public static void fibo(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (num <= 0) {
            arr.clear(); // Limpa o ArrayList
        } else if (num == 1) {
            arr.add(0);
        } else if (num >= 2) {
            arr.add(0);
            arr.add(1);
            for (int i = 2; i < num; i++) {
                int temp = arr.get(i - 2) + arr.get(i - 1);
                arr.add(temp);
            }
        }
        System.out.print("Sequencia Fibonacci: " + arr);
        if (!arr.isEmpty()) {
            System.out.println(" posicao " + num + " Fibonacci: " + arr.get(arr.size() - 1));
        } else {
            System.out.println(" posicao " + num + " Fibonacci: invalida");
        }
    }

    public static void main(String[] args) {
        fibo(7);
    }
}
