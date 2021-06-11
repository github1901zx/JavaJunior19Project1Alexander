package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(5.2, 20));
        System.out.println(minus(10.8, 4.4));
        System.out.println(multiply(25.5, 10));
        System.out.println(divide(100.5, 5));
    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }

    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }

    public static double divide(double num1, double num2) {
        double sum = num1 / num2;
        return sum;
    }
}
