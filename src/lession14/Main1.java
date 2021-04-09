package lession14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            arrayList.add("HwwHwwwH" + i);

        }
        long endTime = System.currentTimeMillis();

        System.out.println(" Время выполнения arrayList.add  " + (endTime-startTime));

        long startTime1 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            linkedList.add ( "HwwHwwwH" + i );

        }
        long endTime1 = System.currentTimeMillis();

        System.out.println(" Время выполнения linkedList.add  " + (endTime1 - startTime1));

        long startTime2 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            arrayList.get(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(" Время выполнения arrayList.get  " + (endTime2 - startTime2));

        long startTime3 = System.currentTimeMillis();
        for(int i = 0; i < 100000;i++){
            linkedList.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println(" Время выполнения linkedList.get  " + (endTime3 - startTime3));
    }
}
