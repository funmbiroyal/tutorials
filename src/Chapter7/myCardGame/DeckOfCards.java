package Chapter7.myCardGame;

import java.security.SecureRandom;

public class DeckOfCards {
   private Card [] deck;
    private int currentCard;
    private static final int numberOfCardsInDeck = 52;
    private static final SecureRandom randomGenerator = new SecureRandom();

    public DeckOfCards(){
        String [] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String []suits ={ "Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[numberOfCardsInDeck];

        for (int i = 0; i < deck.length ; i++) {
          deck[i] = new Card(faces[i % 13],suits[i / 13]);

        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomGenerator.nextInt(numberOfCardsInDeck);
            Card temp = deck[first];
            deck[first]= deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if(currentCard < deck.length){
            return deck[currentCard++];

        }
        return null;
    }

}
