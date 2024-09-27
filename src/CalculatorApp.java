import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addition = calculator.addition(5, 3);
        int substraciton = calculator.subtraction(5, 3);
        double multi = calculator.multiplication(5, 3);
        double divi = calculator.division(0, 4);
        int modi = calculator.modulo(5, 3);
        // Ausgabe
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + substraciton);
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + divi);
        System.out.println("Modulo: " + modi);

    }

    // access-modifier static return-type method-name(parameters) {
    // public void addition(int a, int b) {

    public static class Calculator {
        public int addition(int a, int b) {
            return a + b;
        }

        public int subtraction(int a, int b) {
            return a - b;
        }

        public double multiplication(int a, int b) {
            return a * b;
        }

        public double division(int a, int b) {
            if(b == 0) {
                throw new RuntimeException("Division by zero is not allowed");
            }
            return (double) a / b;
        }

        public int modulo(int a, int b) {
            return a % b;
        }
    }
}
