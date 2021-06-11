package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBrace {
    public static void main(String[] args) {
        String todaysClass = "python";

        if(todaysClass.equals("java"))
            System.out.println("java is fun");

        else
            System.out.println("it is not java. it is " + todaysClass);


    }
}
