package day0_Practice_03_22_2021;
import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter your name");
        input.next();
        String name = input.next();

        System.out.println(number);
        System.out.println(name);

    }
}
