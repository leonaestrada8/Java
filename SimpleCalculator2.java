// CÓDIGO REFATORADO !!!

package Final.J4V4.Calculator15A;

import java.util.Scanner;
import java.util.function.BiFunction;

public class SimpleCalculator2 {
    enum Operation {
        ADD(Double::sum),
        SUBTRACT((a, b) -> a - b),
        MULTIPLY((a, b) -> a * b),
        DIVIDE((a, b) -> b != 0 ? a / b : Double.NaN);

        private final BiFunction<Double, Double, Double> operation;

        Operation(BiFunction<Double, Double, Double> operation) {
            this.operation = operation;
        }

        public double apply(double a, double b) {
            return operation.apply(a, b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operationInput = scanner.next().toUpperCase();

        try {
            Operation operation = Operation.valueOf(operationInput);
            double result = operation.apply(a, b);
            if (Double.isNaN(result)) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println("Result: " + result);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation");
        }

        scanner.close();
    }
}
