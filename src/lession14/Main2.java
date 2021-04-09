package lession14;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("sds");
        list.add("qqq");
        list.add("www");

        /**обычный*/
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        /**foreach*/
        for(String s: list){
            System.out.println(s);
        }
        /**итератор*/
        for(Iterator<String> iter = list.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
