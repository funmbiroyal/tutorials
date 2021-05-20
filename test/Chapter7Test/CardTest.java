package Chapter7Test;

import Chapter7.Card;
import Chapter7.Exception.InvalidCardValueException;
import org.junit.jupiter.api.Test;

import static Chapter7.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    @Test
    void diamondSuitCanBeCreated() {
        Card card = new Card(DIAMOND, 1);
        assertSame(DIAMOND, card.getSuit());

    }

    @Test
    void heartSuitCanBeCreated() {
        Card card = new Card(HEART, 3);
        assertSame(HEART, card.getSuit());
    }

    @Test
    void spadeSuitCanBeCreated() {
        Card card = new Card(SPADE, 3);
        assertSame(SPADE, card.getSuit());
    }

    @Test
    void clubSuitCanBeCreated() {
        Card card = new Card(CLUB, 3);
        assertSame(CLUB, card.getSuit());
    }

    @Test
    void aceCardValueCanBeCreated() {
        Card card = new Card(DIAMOND, 1);
        assertEquals("Ace", card.getValue());
    }

    @Test
    void jackCardValueCanBeCreated() {
        Card card = new Card(DIAMOND, 11);
        assertEquals("Jack", card.getValue());
    }

    @Test
    void queenCardValueCanBeCreated() {
        Card card = new Card(DIAMOND, 12);
        assertEquals("Queen", card.getValue());
    }

    @Test
    void kingCardValueCanBeCreated() {
        Card card = new Card(DIAMOND, 13);
        assertEquals("King", card.getValue());
    }
    @Test
    void exceptionalNumbersCanBeCreated(){
        Card card = new Card(DIAMOND, 7);
        assertEquals("7", card.getValue());
    }
    @Test
    void invalidCardExceptionThrownWhenValueIsInvalid(){
        assertThrows(InvalidCardValueException.class,()-> new Card(DIAMOND,14));
    }
}