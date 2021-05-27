package Chapter7;

import Chapter7.Exception.StackOverflowException;
import Chapter7.Exception.StackUnderflowException;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CardDeck {
    private Card[] cards;
    private int lastPushLocation =-1;
     private final int numberOfCards = 52;
     private static final SecureRandom randomGenerator = new SecureRandom();

    public CardDeck(int numberOfCards) {

        cards = new Card[numberOfCards];
    }

    public  Card peek() {
        return cards[lastPushLocation];
    }

    public int getSize() {
        return cards.length;
    }

    public void push(Card cardGame) {
        if (isFull()){
            throw new StackOverflowException("Card deck is full");
        }
        lastPushLocation++;
        this.cards[lastPushLocation]= cardGame;
    }
    public void shuffleCardsInDeck(){
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = randomGenerator.nextInt(cards.length);
            Card temp = cards[randomIndex];
            cards[randomIndex] = cards[i];
            cards[i] = temp;

        }
        Collections.shuffle(Arrays.asList(cards));

    }

    public Card pop() {
        if(isEmpty()){
            throw new StackUnderflowException("Card deck is Empty");
        }
        return cards[lastPushLocation--];
    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public boolean isFull() {
        return lastPushLocation == getSize() - 1;
    }

}

