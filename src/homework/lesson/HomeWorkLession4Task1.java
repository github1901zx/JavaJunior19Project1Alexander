package homework.lesson;

public class HomeWorkLession4Task1 {
    public static void main(String[] args) {
        int[] mass = {1, 0, 3, 5, 5, 6, 7, 8, 9};
        int numbersValue = 0;//переменная для пункт 5
        int sumEvenNumber = 0; //переменная для пункт 6, четные числа
        int sumOddNumber = 0; //переменная для пункт 6, нечетные числа

        System.out.println("Задание 1 пункт 1");
        for (int j : mass) {
            System.out.println(j);
        }
        System.out.println("Задание 1 пункт 2");
        for (int i = (mass.length - 1); i >= 0; i--) {
            System.out.println(mass[i]);
        }
        System.out.println("Задание 1 пункт 3");
        for (int j : mass) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        System.out.println("Задание 1 пункт 4");
        for (int i = 0; i < mass.length; i = i + 2) {
            System.out.println(mass[i]);
        }
        System.out.println("Задание 1 пункт 5");
        for (int i = 0; i <= (mass.length - 1); i++) {
            numbersValue = mass[i] + numbersValue;
        }
        System.out.println(numbersValue);// конец пунк 5

        System.out.println("Задание 1 пункт 6");
        for (int j : mass) {
            if (j % 2 == 0) {
                sumEvenNumber = sumEvenNumber + j;
            } else {
                sumOddNumber = sumOddNumber + j;
            }
        }
        System.out.println(sumEvenNumber - sumOddNumber);// конец пункт 6

    }
}
