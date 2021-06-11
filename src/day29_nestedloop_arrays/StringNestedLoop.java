package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        //  0123  4
        String word = "java";
        //  1234
        for(int i = 0; i < word.length(); i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        /**
         java
         ava
         va
         a
         OUTER : 0 - word.length()
         INNER : OUTER - word.length()
         */
        for(int i = 0; i < word.length(); i++) {
            for(int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();//new line after inner loop
        }

    }
}
