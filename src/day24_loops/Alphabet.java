package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
//        System.out.println("letter = " + letter);
//        letter++;
//        System.out.println("letter = " + letter);
        while (letter <= 'z') {
            System.out.println(letter + " ");
            letter++;
        }

        //print alphabet reverse order
        letter = 'z';
        while (letter >= 'a') {
            System.out.println(letter + " ");
            letter--;
        }
    }
}
