package Chapter7Test;

import Chapter7.Card;
import Chapter7.Suit2;
import org.junit.jupiter.api.Test;

import static Chapter7.Suit2.*;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CardTest {
    @Test
    void circleSuitCanBeCreated() {
        Card card = Card.createCircleCardOfValue(3);
        assertSame(CIRCLES, card.getSuit());

    }

    @Test
    void triangleSuitCanBeCreated() {
        Card card = Card.createTriangleCardOfValue(3);
        assertSame(TRIANGLES, card.getSuit());
    }

    @Test
    void crossSuitCanBeCreated() {
        Card card = Card.createCrossCardOfValue(2);
        assertSame(CROSSES, card.getSuit());
    }

    @Test
    void SquareSuitCanBeCreated() {
        Card card = Card.createSquareCardOfValue(3);
        assertSame(SQUARES, card.getSuit());
    }
    @Test
    void starSuitCanBeCreated() {
        Card card = Card.createStarCardOfValue(3);
        assertSame(STARS, card.getSuit());
    }
    @Test
    void whotSuitCanBeCreated() {
        Card card = Card.createWhotCardOfValue(3);
        assertSame(WHOT, card.getSuit());
    }

//    @Test
//    void exceptionalNumbersCanBeCreated(){
//        Card card = new Card(CIRCLES, 7);
//        assertEquals("7", card.getValue());
    //}
//    @Test
//    void invalidCardExceptionThrownWhenValueIsInvalid(){
//        assertThrows(InvalidCardValueException.class,()-> new Card(CIRCLES,14));
//    }
//
//    @Test
//    void cardToStringTest(){
//        Card card = new Card(CIRCLES, 13);
//        String expectedToString = "King of Diamond";
//        assertEquals(expectedToString, card.toString());
//        card = new Card(TRIANGLES, 3);
//        expectedToString = "3 of Heart";
//        assertEquals(expectedToString, card.toString());
//        System.out.println(card);
//    }
//
//    @Test
//    void testSameCardValueEquals(){
//        Card kingOfSpade = new Card(CROSSES, 13);
//        Card kingOfHeart  = new Card(TRIANGLES, 13);
//        assertEquals(kingOfHeart, kingOfSpade);
//        assertEquals(kingOfSpade, kingOfHeart);
//    }
//
//    @Test
//    void testSameSuitValueEquals(){
//        Card kingOfSpade = new Card(CROSSES, 13);
//        Card queenOfSpade  = new Card(CROSSES, 12);
//
//        assertEquals(queenOfSpade, kingOfSpade);
//        assertEquals(kingOfSpade, queenOfSpade);
//        CardDeck cardDeck = new CardDeck(2);
//        assertNotEquals(kingOfSpade, cardDeck);
//    }
//
//
//
}