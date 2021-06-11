package lession17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException(" Hе может быть пустым ");
        }

        double num1 = 0;
        double num2 = 0;

        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(" Вы ввели не число 1 ");
        }
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(" Вы ввели не число 2 ");
        }

        if (num2 == 0) {
            throw new ArithmeticException(" не может быть 0");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        if(text == null || word == null){
            throw new NullPointerException("Поля текста и слова не могут быть пустыми");
        }

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);

        int massLenght = 0;

        while (matcher.find()){
            massLenght++;
        }
         matcher.reset();
         int[] indexWordResult = new int [massLenght];
         int k = 0;

        while(matcher.find()){
            indexWordResult[k] = matcher.start();
            k++;
        }

        for(int i = 0; i < indexWordResult.length;i++){
            System.out.print(indexWordResult[i] + " ");
        }

        return indexWordResult;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        Pattern pattern = Pattern.compile("[0-9]\\.[0-9]");
        Matcher matcher = pattern.matcher(text);

        if (!matcher.find()) {
            throw new CustomException("нет цифр в тексте");
        }

        matcher.reset();

        int massLenhgt = 0;
        double val = 0.0;
        int k = 0;

        while (matcher.find()) {
            massLenhgt++;
        }

        double[] result = new double[massLenhgt];

        matcher.reset();

        while (matcher.find()) {
            result[k] = Double.valueOf(matcher.group()); // можно parseDouble()- вернет примитивный тип данных, другой метод иммет кеширование и больше применяется к констрктору, вернет объект
            k++;
        }

        for(int i = 0; i < result.length;i++){
            System.out.print(result[i] + " ");
        }

        return result;
    }
}
