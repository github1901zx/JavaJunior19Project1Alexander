package lession14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();/**разница в скоростри определённых методов
         имеет шаг
         быстрее считывание и замена
         */
        LinkedList<Integer> list1 = new LinkedList<>();/**разница в скоростри определённых методов
         самый слабый метод get
         */

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3,66);// add
        list.set(0,33);//set
        list.get(2);//get
        list.size();
        //list.addAll();обьеденяет колллекции(пересыпает)
        list.contains("s");//boolean

        System.out.println(list);


    }
}
