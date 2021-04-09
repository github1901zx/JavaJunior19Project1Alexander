package lession16;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("eee");
        set.add("qqq");

        for(String s: set){
            System.out.println(s);
        }

    }
}
