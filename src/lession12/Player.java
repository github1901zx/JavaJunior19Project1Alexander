package lession12;

import java.util.ArrayList;
import java.util.Scanner;


public class Player {

    private boolean inGame = true;


    protected ArrayList<Card> hand = new ArrayList<>();

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public boolean areYouDealer() {
        return false;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public void printHand() {
        System.out.println("*Карты игрока*");
        for (Card card : hand) {
            System.out.println(card + " " + card.getValue());
        }
        System.out.println("---------------------");
        System.out.println("Сумма очков " + valueHand());
        System.out.println("---------------------");
    }

    public boolean needCard() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вам нужна карта ? (да / нет)");

        String answer = scanner.nextLine();
        if (answer.equals("да") && valueHand() < 21) {
            return true;
        } else {
            return false;
        }
    }
    public int valueHand() {
        int value = 0;
        for (Card card : hand) {
            value = value + card.getValue();
        }
        return value;
    }
}
