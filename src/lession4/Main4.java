package lession4;

public class Main4 {
    public static void main(String[] args) {
        String text = "Hia";
//        String newText = text;

//        int lengthOfText = text.length();
//        System.out.println(lengthOfText);

       String newText = text.replace('i','I');
       //             newText = newText.replaceAll("[aiurwr]", "?"); замена несуольких букв на символ

       System.out.println(text);
        System.out.println(newText);
    }
}
