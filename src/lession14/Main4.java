package lession14;


import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {

        Coin coin1 = new Coin(2.9,1000,10);
        Coin coin2 = new Coin(2.9,1000,10);
        Coin coin3 = new Coin(3.8,2001,1);
        Coin coin4 = new Coin(4.7,2002,2);
        Coin coin5 = new Coin(5.6,2003,3);

        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        System.out.println(coin1.equals(coin2));

        for(Coin k : coins){
            System.out.println(k);
        }
    }
}
