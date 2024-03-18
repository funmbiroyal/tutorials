//package Chapter7Test;
//
//import Chapter7.Card;
//import Chapter7.CardDeck;
//import Chapter7.Exception.StackOverflowException;
//import Chapter7.Exception.StackUnderflowException;
//import Chapter7.Suit2;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static Chapter7.Suit2.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CardDeckTest {
//    CardDeck cardDeck;
//    @BeforeEach
//    void startEachTestWith(){
//        cardDeck = new CardDeck(4);
//    }
//    @Test
//    void cardDeckHasFixedSize(){
//        assertEquals(4,cardDeck.getSize());
//    }
//    @Test
//    void pushOnce_elementPushedShouldBeLast(){
//        Card cardGame= new Card(CIRCLES,4);
//        cardDeck.push(cardGame) ;
//        assertEquals(cardGame,cardDeck.peek());
//    }
//    @Test
//    void pushTwice_PopOnce_AndPeekShouldReturnTheFirstElement(){
//        Card firstCard = new Card(Suit2.CIRCLES,4);
//        Card secondCard = new Card(Suit2.CROSSES,7);
//        cardDeck.push(firstCard);
//        cardDeck.push(secondCard);
//        Card poppedCard = cardDeck.pop();
//        assertSame(secondCard,poppedCard);
//        assertEquals(firstCard,cardDeck.peek());
//    }
//    @Test
//    void popEmptyCardDeck_ThrowsStackUnderflowException(){
//        assertTrue(cardDeck.isEmpty());
//        assertThrows(StackUnderflowException.class,()-> cardDeck.pop());
//
//    }
//    @Test
//    void pushIntoFullDeck_ThrowsStackOverflowExceptions(){
//        Card cardGame = new Card(Suit2.TRIANGLES,6);
//        for(int i = 0; i < 4; i++){
//            cardDeck.push(cardGame);
//        }
//        assertTrue(cardDeck.isFull());
//        assertThrows(StackOverflowException.class,()-> cardDeck.push(cardGame));
//    }
//    @Test
//    void canShuffleCardDeck(){
//        Card firstCard = new Card(Suit2.TRIANGLES,2);
////        Card firstCard = new Card(Suit2.TRIANGLES, 2);
//        Card secondCard = new Card(Suit2.CROSSES, 1);
//        Card thirdCard = new Card(Suit2.CIRCLES, 10);
//        Card fourthCard = new Card(Suit2.SQUARES, 13);
//        cardDeck.push(firstCard);
//        cardDeck.push(secondCard);
//        cardDeck.push(thirdCard);
//        cardDeck.push(fourthCard);
//        assertSame(thirdCard, cardDeck.peek());
//        cardDeck.shuffleCardsInDeck();
//        assertNotSame(fourthCard, cardDeck.peek());
//
//
//    }
//}