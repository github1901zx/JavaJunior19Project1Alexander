package lession12;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        Dealer dealer = new Dealer();

        BlackJackGame game = new BlackJackGame();

        game.addPlayer(player);
        game.addPlayer(dealer);

        game.dealСards();
        game.nextDealToCards();
        game.whoWinner();

    }

}
