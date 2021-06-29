package practic;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print number");
        String str = scanner.next();
        char[] mass = str.toCharArray();
        int j = 1;
        boolean trig = false;

        if (mass[0] != mass[mass.length - 1]) {
            System.out.println("it's not polindorom");
            return;
        }

        if (mass.length < 3 || mass[0] == mass[1]) {
            System.out.println("it's polindorom");
            return;
        }

        if (mass.length < 4 || mass[0] == mass[1]) {
            System.out.println("it's polindorom");
            return;
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == mass[mass.length - j] && j < mass.length / 2) {
                trig = true;
            }
            j++;
        }
        if (trig == true) {
            System.out.println("it's polindorom");
        } else {
            System.out.println("it's not polindorom");
        }
    }

}

