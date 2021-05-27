package Chapter7;

import Chapter7.Exception.InvalidCardValueException;

public class Card {
    private final Suit suit;
    private final int value;
    public Card(Suit suit, int value) {
        if (value < 1 || value > 13){
            throw new InvalidCardValueException("value + is not a valid card value");
        }
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getValue() {
        return switch (this.value) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> value + "";
        };
    }

    @Override
    public String toString() {
        return getValue() + " of " + suit.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())){
            return false;
        }
        Card cardToCompare = (Card) obj;
        return this.value == cardToCompare.value || this.suit == cardToCompare.suit;
    }
}
