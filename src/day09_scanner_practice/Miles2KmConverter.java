package day09_scanner_practice;
import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("######### MILES TO KM CONVERTER ##########");
        System.out.println("Enter miles: ");
        // double miles = 10.0
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles + " miles in kilometers: " + kilometers);

    }
}
