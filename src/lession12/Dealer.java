package lession12;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealer extends Player {



    @Override
    public boolean areYouDealer() {
        return true;
    }

    @Override
    public boolean needCard() {
        System.out.println("Вам нужна карта ? (да / нет)");
        if (valueHand() < 16) {
            System.out.println("да");
            return true;
        } else {
            System.out.println("нет");
            return false;

        }
    }

    @Override
    public void printHand() {
        System.out.println("*Карты диллера*");
        for (Card card : hand) {
            System.out.println(card + " " + card.getValue());
        }
        System.out.println("---------------------");
        System.out.println("Сумма очков " + valueHand());
        System.out.println("---------------------");
    }
}
