package Chapter7.myCardGameTests;

import Chapter7.myCardGame.Card;
import Chapter7.myCardGame.DeckOfCards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class DeckOfCardsTest {
    DeckOfCards deckOfCards;
    Card[] deck;
    int numberOfCardsInDeck = 52;
    @BeforeEach
    void startAllTestWith(){
        deckOfCards = new DeckOfCards();
    }
    @Test
    void createDeckOfCardsTest(){
        assertNotNull(deckOfCards);
    }
    @Test
    void canShuffleTest(){
        DeckOfCards deckOfCards = new DeckOfCards();
        DeckOfCards deckOfCards2 = new DeckOfCards();
        deckOfCards.shuffle();
        assertNotSame(deckOfCards,deckOfCards2);
    }
    @Test
    void canDealCardTest(){
        deckOfCards.shuffle();
        
    }

}
