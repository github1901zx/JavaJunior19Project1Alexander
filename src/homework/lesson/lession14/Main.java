package homework.lesson.lession14;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String... args) throws Exception {


        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        CollectionUtilsHomeWork col = new CollectionUtilsHomeWork();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0 ; i < 10;i++){
            list1.add(i);
            list2.add(i);
            list2.add(i);
            set1.add(i);
            set2.add(i);
        }
        list2.add(100);
        list2.add(200);




        for (Integer i: list1){
            System.out.print(i);
        }
        System.out.println();
        for (Integer i: list2){
            System.out.print(i);
        }
        System.out.println();
        for (Integer i: set1){
            System.out.print("|" + i);
        }
        System.out.println();
        for (Integer i: set2){
            System.out.print("|" + i);
        }
        System.out.println();

        System.out.println("union  " + col.union(list1,list2));
        System.out.println("intersection  " + col.intersection(list1,list2));
        System.out.println("unionWithoutDuplicate  " + col.unionWithoutDuplicate(set1,set2));
        System.out.println("intersectionWithoutDuplicate  " + col.intersectionWithoutDuplicate(set1,set2));
        System.out.println("difference  " + col.difference(list1,list2));


    }
}
