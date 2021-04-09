package homework.lesson;

import java.util.Scanner;

public class HomeWorkLession2Task1Input {
    public static void main(String[] args) {

        Scanner usr1Scanner = new Scanner(System.in);

        System.out.println("Введите сторону:");
        double figureSideA = usr1Scanner.nextDouble();
        System.out.println("Введите сторону:");
        double figureSideB = usr1Scanner.nextDouble();
        System.out.println("Введите сторону:");
        double figureSideC = usr1Scanner.nextDouble();
        System.out.println("Введите сторону:");
        double figureSideE = usr1Scanner.nextDouble();


        if (figureSideA == figureSideB && figureSideB == figureSideC && figureSideC == figureSideE) {
            System.out.println("Квадрат");
        } else if (figureSideA == figureSideC && figureSideB == figureSideE || figureSideA == figureSideB && figureSideC == figureSideE || figureSideA == figureSideE && figureSideB == figureSideC) {
            System.out.println("Прямоугольник");
        } else {
            System.out.println("Разносторонний четырех угольник");// без учета трапеции
        }
    }
}
