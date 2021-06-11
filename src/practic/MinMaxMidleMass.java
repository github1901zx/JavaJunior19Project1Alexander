package practic;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxMidleMass {
    public static void main(String[] args) {

////        1.0. Максимальное, минимальное и среднее значение
////        Задача:
////        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
////        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
//
//        double[] mass = new double[5];
//        double temp1 = 100;
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = --temp1;
//            System.out.println(mass[i]);
//        }
//
//        mass[0] = 15;
//        mass[3] = 5;
//        mass[4] = 100;
//        mass[2] = 1;
//
//        double min = mass[0];
//        double max = mass[0];
//        double avg = 0;
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i] > max) {
//                max = mass[i];
//            }
//            if (mass[i] < min) {
//                min = mass[i];
//            }
//            avg += mass[i] / mass.length;
//        }
//        System.out.println("max " + max);
//        System.out.println("min " + min);
//        System.out.println("mid " + avg);
//
////        1.1. Реализуйте алгоритм сортировки пузырьком для сортировки массива
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0 + i; j < mass.length; j++) {
//                if (mass[i] > mass[j]) {
//                    double temp = mass[j];
//                    mass[j] = mass[i];
//                    mass[i] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < mass.length; i++) {
//            System.out.println(mass[i]);
//        }
//
////        1.2. Поиск простых чисел
////        Задача:
////        Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
////        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
//
//        for (int i = 2; i < 100; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i);
//            }
//        }
//
////        1.3. Удаление из массива
////        Задача:
////        Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
//
//        int[] massTest = new int[100];
//        for (int i = 0; i < massTest.length; i++) {
//            massTest[i] = i;
//        }
//        for (int i = 0; i < massTest.length;i++){
//            System.out.print(massTest[i]+".");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\nВведите число: ");
//        int value = scanner.nextInt();
//
//        for (int i = 0; i < massTest.length; i++) {
//            if (massTest[i] == value) {
//                massTest[i] = 0;
//            }
//        }
//        for (int i = 0; i < massTest.length;i++){
//            System.out.print(massTest[i]+":");
//        }

//2.0. Проектирование и создание класса, описывающего вектор

        Vector vec1 = new Vector(2,2,2);
        Vector vec2 = new Vector(3,3,3);

        System.out.println(vec1.leanghtVector());

        System.out.println(vec1.scalarVector(vec2));
    }
}