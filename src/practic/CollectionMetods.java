package practic;

import java.util.*;

public class CollectionMetods {
    public static void main(String[] args) {
        int numbers = 0;
        ArrayList arrayListFist = new ArrayList();

        HashMap<Integer,Integer> hs1 = new HashMap<>();

        while (numbers < 10) {
            arrayListFist.add(numbers);//добавляет элемент в коллекцию
            hs1.put(numbers,numbers+1);
            numbers++;

        }

        System.out.println("ForEach");
        for (Object i : arrayListFist) {
            System.out.print(i);
        }
        System.out.println("\nIterator");
        for (Iterator<Integer> itr = arrayListFist.iterator(); itr.hasNext(); ) {   //вызываем итератор , проверяем следующий элемент
            System.out.print(itr.next());
        }
        System.out.println("\nFor only index \"ArrayList\"");
        for (int i = 0; i < arrayListFist.size(); i++) {    //возващает размер коллекции
            System.out.print(i);
        }
        System.out.println("\nWhile");
        int j = 0;
        while (!arrayListFist.isEmpty()) {  //проверяет пуста-ли коллекция
            System.out.print(arrayListFist.get(j));
            j++;
            if (j == arrayListFist.size()) {
                break;
            }
        }
        System.out.println("\nForEachHashMap");
        for (Integer i :hs1.keySet()) {
            System.out.println(hs1.get(i));
        }

//        arrayListFist.add(0);
//        System.out.println("------------------");
//        ArrayList<Object> as = new ArrayList<>(removeDups(arrayListFist));
//        for (Object q:as) {
//            System.out.print(q);
//        }


    }

//    public static Collection<Object> removeDups(Collection<Object> collection){
//        HashSet<Object> hashSet = new HashSet<>();
//        hashSet.addAll(collection);
//        return hashSet;
//    }
}
