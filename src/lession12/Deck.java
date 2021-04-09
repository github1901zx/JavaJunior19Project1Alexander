package lession12;

import java.util.concurrent.ThreadLocalRandom;

public class Deck {

    private Card[] deckCards = new Card[52];

    public Deck() {

        deckCards[0] = new Card("Двойка Трефа", 2);
        deckCards[1] = new Card("Двойка Черви", 2);
        deckCards[2] = new Card("Двойка Бубны", 2);
        deckCards[3] = new Card("Двойка Пики", 2);

        deckCards[4] = new Card("Тройка Трефа", 3);
        deckCards[5] = new Card("Тройка Черви", 3);
        deckCards[6] = new Card("Тройка Бубны", 3);
        deckCards[7] = new Card("Тройка Пики", 3);

        deckCards[8] = new Card("Четверка Трефа", 4);
        deckCards[9] = new Card("Четверка Черви", 4);
        deckCards[10] = new Card("Четверка Бубны", 4);
        deckCards[11] = new Card("Четверка Пики", 4);

        deckCards[12] = new Card("Петерка Трефа", 5);
        deckCards[13] = new Card("Петерка Черви", 5);
        deckCards[14] = new Card("Петерка Бубны", 5);
        deckCards[15] = new Card("Петерка Пики", 5);

        deckCards[16] = new Card("Шестерка Трефа", 6);
        deckCards[17] = new Card("Шестерка Черви", 6);
        deckCards[18] = new Card("Шестерка Бубны", 6);
        deckCards[19] = new Card("Шестерка Пики", 6);

        deckCards[20] = new Card("Семерка Трефа", 7);
        deckCards[21] = new Card("Семерка Черви", 7);
        deckCards[22] = new Card("Семерка Бубны", 7);
        deckCards[23] = new Card("Семерка Пики", 7);

        deckCards[24] = new Card("Восьмерка Трефа", 8);
        deckCards[25] = new Card("Восьмерка Черви", 8);
        deckCards[26] = new Card("Восьмерка Бубны", 8);
        deckCards[27] = new Card("Восьмерка Пики", 8);

        deckCards[28] = new Card("Девятка Трефа", 9);
        deckCards[29] = new Card("Девятка Черви", 9);
        deckCards[30] = new Card("Девятка Бубны", 9);
        deckCards[31] = new Card("Девятка Пики", 9);

        deckCards[32] = new Card("Десятка Трефа", 10);
        deckCards[33] = new Card("Десятка Черви", 10);
        deckCards[34] = new Card("Десятка Бубны", 10);
        deckCards[35] = new Card("Десятка Пики", 10);

        deckCards[36] = new Card("Валет Трефа", 2);
        deckCards[37] = new Card("Валет Черви", 2);
        deckCards[38] = new Card("Валет Бубны", 2);
        deckCards[39] = new Card("Валет Пики", 2);

        deckCards[40] = new Card("Дама Трефа", 3);
        deckCards[41] = new Card("Дама Черви", 3);
        deckCards[42] = new Card("Дама Бубны", 3);
        deckCards[43] = new Card("Дама Пики", 3);

        deckCards[44] = new Card("Король Трефа", 4);
        deckCards[45] = new Card("Король Черви", 4);
        deckCards[46] = new Card("Король Бубны", 4);
        deckCards[47] = new Card("Король Пики", 4);

        deckCards[48] = new Card("Туз Трефа", 11);
        deckCards[49] = new Card("Туз Черви", 11);
        deckCards[50] = new Card("Туз Бубны", 11);
        deckCards[51] = new Card("Туз Пики", 11);

    }

    public Card randomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
        return deckCards[randomNum];
    }


}
