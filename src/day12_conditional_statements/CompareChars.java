package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'M'; //77
        char letter2 = 'R'; //82
        System.out.println(letter1==letter2); //77 == 82
        System.out.println(letter1>letter2); //77 > 82
        System.out.println(letter1<letter2); //77 < 82
        System.out.println(letter1!=letter2);

        char grade ='A';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);


    }
}
