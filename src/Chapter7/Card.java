package Chapter7;

import Chapter7.Exception.InvalidCardValueException;

public class Card {
    private final Suit suit;
    private final int value;
    public Card(Suit suit, int value) {
        if (value <1 || value > 12){
            throw new InvalidCardValueException("value + is not a valid vardvvalue");
        }
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getValue() {
        switch (this.value){
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return value + "";

        }
    }
}
