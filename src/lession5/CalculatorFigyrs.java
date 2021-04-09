package lession5;

import java.util.Scanner;

public class CalculatorFigyrs {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Введите фигуру");
        String figyra = newScanner.nextLine();
        System.out.println("Площадь или периметр");
        String action = newScanner.nextLine();

        if (figyra.equalsIgnoreCase("Круг")) {
            System.out.println("введите радиус:");
            double radcircle = newScanner.nextDouble();
            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("Периметр круг: " + (2 * Math.PI) * radcircle);
            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круг: " + (Math.PI * (radcircle * radcircle)));
            } else {
                System.out.println("Некоректные данные");
            }
        } else if (figyra.equalsIgnoreCase("Овал")) {

            System.out.println("По осям или полуосям");
            String actionellipse = newScanner.nextLine();

            if (actionellipse.equalsIgnoreCase("полуосям")) {
                System.out.println("введите полуось А:");
                double radellipse1 = newScanner.nextDouble();
                System.out.println("введите полуось В:");
                double radellipse2 = newScanner.nextDouble();

                if (action.equalsIgnoreCase("периметр")) {
                    System.out.println("Периметр овала: " + (
                            2 * Math.PI * Math.sqrt(((radellipse1 * radellipse1) + (radellipse2 * radellipse2)) / 2)));
                } else if (action.equalsIgnoreCase("площадь")) {
                    System.out.println("Площадь овала: " + (Math.PI * (radellipse1 * radellipse2)));
                } else {
                    System.out.println("Некоректные данные");
                }
            } else if (actionellipse.equalsIgnoreCase("осям")) {
                System.out.println("введите ось А:");
                double radellipse1 = newScanner.nextDouble();
                System.out.println("введите ось В:");
                double radellipse2 = newScanner.nextDouble();

                if (action.equalsIgnoreCase("периметр")) {
                    System.out.println("Периметр овала: " + (
                            2 * Math.PI * Math.sqrt(((radellipse1 * radellipse1) + (radellipse2 * radellipse2)) / 8)));
                } else if (action.equalsIgnoreCase("площадь")) {
                    System.out.println("Площадь овала: " + (Math.PI * (radellipse1 * radellipse2) / 4));
                } else {
                    System.out.println("Некоректные данные");
                }
            }
        } else if (figyra.equalsIgnoreCase("Прямоугольник")) {

            System.out.println("введите Длинну:");
            double sideA = newScanner.nextDouble();
            System.out.println("введите Ширину:");
            double sideB = newScanner.nextDouble();

            if (action.equalsIgnoreCase("периметр") && sideA != sideB) {
                System.out.println("Периметр прямоугольника: " + sideA + sideB + sideA + sideB);
            } else if (action.equalsIgnoreCase("площадь") && sideA != sideB) {
                System.out.println("Площадь прямоугольника: " + sideA * sideB);

            } else if (action.equalsIgnoreCase("периметр") && sideA == sideB) {
                System.out.println("Ваша фигура квадрат и его площадь: " +
                        (sideA + sideB + sideA + sideB));
            } else if (action.equalsIgnoreCase("площадь") && sideA == sideB) {
                System.out.println("Ваша фигура квадрат и его площадь: " +
                        (sideA * sideB));
            } else {
                System.out.println("Некоректные данные");
            }

        } else if (figyra.equalsIgnoreCase("Трапеция")) {

            if (action.equalsIgnoreCase("периметр")) {

                System.out.println("введите Сторону 1:");
                double sideATr = newScanner.nextDouble();
                System.out.println("введите Сторону 2:");
                double sideBTr = newScanner.nextDouble();
                System.out.println("введите Сторону 3:");
                double sideCTr = newScanner.nextDouble();
                System.out.println("введите Сторону 4:");
                double sideDTr = newScanner.nextDouble();

                System.out.println("Периметр трапеции: " + sideATr + sideBTr + sideCTr + sideDTr);
            } else if (action.equalsIgnoreCase("площадь")) {

                System.out.println("введите основание 1:");
                double base1Tr = newScanner.nextDouble();
                System.out.println("введите основание 2:");
                double base2Tr = newScanner.nextDouble();
                System.out.println("введите высоту:");
                double heightTr = newScanner.nextDouble();

                System.out.println("Площадь трапеции: " +
                        (0.5 * (base1Tr + base2Tr) * heightTr));
            } else {
                System.out.println("Некоректные данные");
            }

        } else {
            System.out.println("Такой фигуры нет в программе");
        }
    }
}
