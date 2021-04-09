package lession12;

import java.util.ArrayList;

public class BlackJackGame {

    private Deck deck1 = new Deck();

    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void dealСards() {
        for (Player player : players) {
            player.addCardToHand(deck1.randomCard());
            player.addCardToHand(deck1.randomCard());
        }
    }

    public void nextDealToCards() {
        for (Player player : players) {
            player.printHand();
            while (player.needCard()) {
                player.addCardToHand(deck1.randomCard());
                player.printHand();
            }
        }
    }

    public void whoWinner() {
        for (Player player : players) {
            if (player.valueHand() > 21) {
                player.setInGame(false);
            }
        }
        if(playerInGame() == 0){
            System.out.println("-------------Dealer Winner----------------");
            return;
        }
        int valueWinner = 0;
        for (Player player : players) {
            if (valueWinner < player.valueHand()) {
                valueWinner = player.valueHand();
            }
        }
        for (Player player : players) {
            if (valueWinner == player.valueHand()) {
                System.out.println("----------Winner---------------");
                player.valueHand();
            }
        }
    }

    public int playerInGame() {
        int countPlayer = 0;
        for (Player player : players) {
            if (player.isInGame()) {
                countPlayer++;
            }
        }
        return countPlayer;
    }
}




