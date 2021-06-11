package practic;

import java.util.Locale;

public class StringMetods {

    public static void main(String[] args) {
        String str1 = " I am Pragrammer Java. My name Vlad, i am best shit coder. ";
        String str2 = " Hello world ";
        int number = 1990;

        System.out.println("length String " + str1.length() + " symbol"); // + glues lines

        char[] ch1 = str1.toCharArray();
        for (char ch : ch1) {
            System.out.print(ch);
        }

        System.out.println();
        System.out.println("isEmpty " + str1.isEmpty());
        System.out.println();
        System.out.println(str1.concat(str2));
        String str3 = String.valueOf(number);//valueOf static
        System.out.println(str3);
        System.out.println(str1.compareTo(str3));
        String Str1 = new String("Добро пожаловать на asdasd.com");
        char[] Str2 = new char[7];

        try {
            Str1.getChars(2, 9, Str2, 0);
            System.out.print("Скопированное значение: ");
            System.out.println(Str2);

        } catch (Exception ex) {
            System.out.print("Возникает исключение...");ex.printStackTrace();
        }

        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.regionMatches(1,"asda",1,1));
        System.out.println(str1.indexOf("J"));
        System.out.println(str1.lastIndexOf("J"));
        System.out.println(str1.startsWith("J"));
        System.out.println(str1.endsWith(" "));
        System.out.println(str1.trim());
        System.out.println(str1.substring(2));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

    }


}

