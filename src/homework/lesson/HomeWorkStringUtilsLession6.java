package homework.lesson;

public class HomeWorkStringUtilsLession6 {
    /**
     * 1 - модифкатор доступа
     * public (доступ везде в проекте)
     * ____________ (доступ внутри текущей папки)
     * protected (доступ внутри фаила и его наследниками)
     * private (достпу внутри текущего класса)
     * 2 - static (либо пишем, либо нет)
     * 3 - возвращаемый тип (или слово Void)
     * 4 -  название метода (всегда с маленькой буквы)
     * 5 - входящие параметры в  (), или просто (___) если их нет
     * 6 - тело выполнения метода
     */
    //Task1
    public static void newLineText(String text) {
        String[] words1 = text.split(" ");
        for (String s : words1) {
            System.out.println(s);
        }
    }//end Task1

    //Task2
    public static void sumLettersText(String text1) {
        char[] letters = text1.toCharArray();
        char[] alpavit = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        int lenghtNoSymbols = 0;
        for (char c : alpavit) {
            for (char letter : letters) {
                if (letter == c) {
                    lenghtNoSymbols = lenghtNoSymbols + 1;
                }
            }

        }

        System.out.println(lenghtNoSymbols);
    }//end Task2

    //Task3
    public static void longestText(String textOne, String textTwo) {
        String[] wordOne = textOne.split(" ");
        String[] wordTwo = textTwo.split(" ");

        if (wordOne.length > wordTwo.length) {
            System.out.println(textOne);
        } else if (wordOne.length < wordTwo.length) {
            System.out.println(textTwo);
        } else {
            System.out.println("Длина текстов одинакова");
        }

    }// end Task3

    //Task4
    public static void toUpperCaseForFirstLette(String textTask4) {

        StringBuilder text2Task4 = new StringBuilder(textTask4.substring(0, 1).toUpperCase());
        //первый символ делаем заглавным

        for (int i = 1; i < textTask4.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(textTask4.substring(i - 1, i)))
                text2Task4.append(textTask4.substring(i, i + 1).toUpperCase());
            else
                text2Task4.append(textTask4.charAt(i));
        }

        System.out.println(text2Task4);
    }// end Task4

    //Task5
    public static void evenOddNumbers(int num1, int num2, int num3, int num4, int num5) {
        int[] massNumber = {num1, num2, num3, num4, num5};
        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int j : massNumber) {
            if (massNumber[j] % 2 == 0) { // ноль в десятичной системе является четным числом т.к -2;-1;0;1;2
                evenNumbers = evenNumbers + 1;
            } else {
                oddNumbers = oddNumbers + 1;
            }
        }
        if (evenNumbers > oddNumbers) {
            System.out.println("Больше четных чисел, их:" + evenNumbers);
        } else if (evenNumbers < oddNumbers) {
            System.out.println("Больше нечетных чисел, их:" + oddNumbers);
        }
    }// end Task5
}

