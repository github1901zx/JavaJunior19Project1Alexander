package homework.lesson;

//import java.util.Arrays;

public class HomeWorkLession4Task2 {
    public static void main(String[] args) {
        String text = ("Hi, my name is java. And your name?...");
//      char[] massText = text.toCharArray();
        String newText = text.replaceAll("[AEIOUYaeiouy]", "?");
        String[] partsText = text.split(" ");


        System.out.println("Задание 2 пункт 1");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == ',' || text.charAt(i) == ';' ||
                    text.charAt(i) == ':' || text.charAt(i) == '?' || text.charAt(i) == '!' ||
                    text.charAt(i) == '"' || text.charAt(i) == '-') {
                System.out.println(text.charAt(i));
            }
        }
        System.out.println("Задание 2 пункт 2");
//        for (int i = 0; i < massText.length; i++) {//«A», «E», «I», «O», «U», «Y»
//            if (massText[i] == 'A' || massText[i] == 'E' || massText[i] == 'I' || massText[i] == 'O'
//                    || massText[i] == 'U' || massText[i] == 'Y' || massText[i] == 'a'
//                    || massText[i] == 'e' || massText[i] == 'i' || massText[i] == 'o'
//                    || massText[i] == 'u' || massText[i] == 'y') {
//                char value = '?';
//                massText[i] = value;
//            }
//        }
//        System.out.println(Arrays.toString(massText));
        System.out.println(newText);

        System.out.println("Задание 2 пункт 3");
        for (String s : partsText) {
            System.out.println(s);
        }
        System.out.println("Задание 2 пункт 4");
        for (int i = (partsText.length - 1); i >= 0; i--) {
            System.out.println(partsText[i]);
        }
    }
}