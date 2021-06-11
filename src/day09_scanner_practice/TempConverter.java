package day09_scanner_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("####### F to C CONVERTER PROGRAM #######");
        System.out.println("Enter Fahrenheits: ");
        double fahrenheitValue = scan.nextDouble();
        double celsiusValue = (fahrenheitValue - 32) * 5 / 9;
        System.out.println(fahrenheitValue + " F in C " + celsiusValue);



    }
}
