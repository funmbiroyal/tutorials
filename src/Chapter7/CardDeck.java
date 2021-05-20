package Chapter7;

import Chapter7.Exception.StackOverflowException;
import Chapter7.Exception.StackUnderflowException;

public class CardDeck {
    private Card[] cardGame;
    private int lastPushLocation =-1;

    public CardDeck(int numberOfCards) {
        cardGame = new Card[numberOfCards];
    }

    public  Card peek() {
        return cardGame[lastPushLocation];
    }

    public int getSize() {
        return cardGame.length;
    }

    public void push(Card cardGame) {
        if (isFull()){
            throw new StackOverflowException("Card deck is full");
        }
        lastPushLocation++;
        this.cardGame[lastPushLocation]= cardGame;
    }

    public Card pop() {
        if(isEmpty()){
            throw new StackUnderflowException("Card deck is Empty");
        }
        return cardGame[lastPushLocation--];
    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public boolean isFull() {
        return lastPushLocation == getSize() - 1;
    }
}

