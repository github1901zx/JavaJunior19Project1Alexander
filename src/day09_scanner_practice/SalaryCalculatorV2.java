package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly Pay = " + weeklyPay);
        System.out.println("Annual Pay = " + annualPay);
        System.out.println("Monthly Pay = " + monthlyPay);
    }
}
