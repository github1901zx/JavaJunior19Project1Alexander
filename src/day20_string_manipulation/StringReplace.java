package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String sentence = "java strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a","u"));
        System.out.println(sentence.replace("string","conditions"));
        System.out.println(sentence.replace("java ",""));
    }
}
