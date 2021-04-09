package lession5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Введите сторону А");
        int inputA = newScan.nextInt();
        System.out.println("Введите сторону B");
        int inputB = newScan.nextInt();
        System.out.println("Введите сторону C");
        int inputC = newScan.nextInt();

        int ploshd = inputA * inputB * inputC;
        int pirimetr = inputA + inputB + inputC;


        System.out.println("Площадь: " + ploshd);
        System.out.println("Пириметр: " + pirimetr);
    }
}
