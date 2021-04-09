package lession6;

public class Main {
    public static void main(String[] args) {
        int result = NumbersUtils.minNum(1, 2, 3);
        System.out.println(result);

        String Figurs = NumbersUtils.figursScanner(2, 2, 2, 2);
        System.out.println(Figurs);

        int countWords = StringUtils.countWords("Привет меня зовут Саша а тебя?");
        System.out.println(countWords);

        StringUtils.whatisFile("C.exe");

        StringUtils.invertedText("Hi my name is Alexender");

        StringUtils.printPoints("Hi?..,,");

        StringUtils.countPoints("Hi?..,,");

        StringUtils.replaceFistSymbolWithUpper("Привет как дела? Хорошо, спасибо");
    }
}
