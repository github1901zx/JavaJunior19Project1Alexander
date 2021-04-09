package lession2;

public class Main1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 3;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}

