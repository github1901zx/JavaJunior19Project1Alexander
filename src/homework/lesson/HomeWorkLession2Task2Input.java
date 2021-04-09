package homework.lesson;

import java.util.Scanner;

public class HomeWorkLession2Task2Input {
    public static void main(String[] args) {

        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int numA = usrScanner.nextInt();
        System.out.println("Введите число :");
        int numB = usrScanner.nextInt();
        System.out.println("Введите число :");
        int numC = usrScanner.nextInt();
        System.out.println("Введите число :");
        int numE = usrScanner.nextInt();
        System.out.println("Введите число :");
        int numW = usrScanner.nextInt();

        if (numA <= numB && numA <= numC && numA <= numE && numA <= numW) {
            System.out.println("Наименьшее число : " + numA);
        } else if (numB <= numA && numB <= numC && numB <= numE && numB <= numW) {
            System.out.println("Наименьшее число : " + numB);
        } else if (numC <= numA && numC <= numB && numC <= numE && numC <= numW) {
            System.out.println("Наименьшее число : " + numC);
        } else if (numE <= numA && numE <= numB && numE <= numC && numE <= numW) {
            System.out.println("Наименьшее число : " + numC);
        } else {
            System.out.println("Наименьшее число : " + numW);
        }
    }
}
