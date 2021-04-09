package lession6;

public class StringUtils {
    public static int countWords(String text) {
        // Привет меня зовут Саша, а тебя?
        String[] words = text.split(" ");
        return words.length;
    }

    public static void whatisFile(String pass) {
        if (pass.endsWith("png") || pass.endsWith("jpg") || pass.endsWith("gif")) {
            System.out.println("Это картинка");
        } else if (pass.endsWith("avi") || pass.endsWith("mpg4") || pass.endsWith("mov")) {
            System.out.println("Это видео");
        } else if (pass.endsWith("exe")) {
            System.out.println("Это программа");
        } else {
            System.out.println("Это какойто файл");
        }
    }

    public static void invertedText(String text) {
        char[] textReverse = text.toCharArray();
        for (int i = textReverse.length - 1; i >= 0; i--) {
            System.out.print(textReverse[i]);
        }
        System.out.println();
    }

    public static void printPoints(String text) {
        char[] textPoints = text.toCharArray();
        for (int i = 0; i < textPoints.length; i++) {
            if (textPoints[i] == '.' || textPoints[i] == ',' || textPoints[i] == '?') {
                System.out.println(textPoints[i]);
            }
        }
    }
    public static void countPoints(String text) {
        char[] textPoints = text.toCharArray();
        int сharacters = 0;

        for (int i = 0; i < textPoints.length; i++) {

            if (textPoints[i] == '.' || textPoints[i] == ',' || textPoints[i] == '?') {
                сharacters++;
            }
        }
        System.out.println(сharacters);
    }

    public static void replaceFistSymbolWithUpper (String text){
        // text = I am programmer
        char [] charsFromText = text.trim().toCharArray();
        System.out.print(Character.toUpperCase(charsFromText[0]));
        for(int i = 1 ; i < charsFromText.length; i++){
            System.out.print(charsFromText[i]);
            if(charsFromText[i] == ' '){
                charsFromText[i + 1] = Character.toUpperCase(charsFromText[ i + 1 ]);
            }
        }

    }
}
