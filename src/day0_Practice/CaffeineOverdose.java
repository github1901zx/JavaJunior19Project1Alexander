package day0_Practice;
import java.util.Scanner;


public class CaffeineOverdose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
        String sport = "";

        if(isTall) {

            if(isFast) {
                sport = "basketball";
            }else if(isFlexible) {
                sport = "gymnastics";
            }else {
                sport = "volleyball";
            }
        }else{
            if(isFast) {
                sport = "soccer";
            }else{
                sport = "tennis";
            }
        }
        System.out.println(sport);



    }
    }


