package lession12;

public class Card {

    private String nameCard;
    private int value;

    public Card(){

    }

    public Card(String nameCard, int value) {
        this.nameCard = nameCard;
        this.value = value;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (value != card.value) return false;
        return nameCard != null ? nameCard.equals(card.nameCard) : card.nameCard == null;
    }

    @Override
    public int hashCode() {
        int result = nameCard != null ? nameCard.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return nameCard;
    }
}
