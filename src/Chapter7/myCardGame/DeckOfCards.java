package Chapter7.myCardGame;

import java.security.SecureRandom;
//import java.util.Random;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int numberOfCardsInDeck = 52;
    private static final SecureRandom randomGenerator = new SecureRandom();

    public DeckOfCards() {

        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[numberOfCardsInDeck];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);

        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomGenerator.nextInt(numberOfCardsInDeck);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];

        }
        return null;
    }

    protected Card[] populateDeck() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[numberOfCardsInDeck];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
        return deck;
    }

    public Card[] dealHand() {
        Card[] hand = new Card[5];
        Card[] deck = populateDeck();
        shuffle();
        for (int i = 0; i < hand.length; i++) {
            hand[i] = deck[i];
        }
        return hand;
    }

    public boolean isPair() {
        Card []hand = dealHand();
        for (int i = 0; i < hand.length; i++) {
            for (int j = i+1; j < hand.length; j++) {
                if (hand[i] == hand[j]){
                    return true;
                }

            }

        }
        return false;
    }
//    public boolean containTwoPairs(){
//        Card [] hand = dealHand();
//
//  }
    public Card[] is3Jacks(){
        Card card = new Card("Jack","Heart");

        Card [] cards = new Card[3];
        Card [] hand = dealHand();
            for (int i = 0; i < hand.length ; i++) {
                if (card.getFace().equals("Jack")){
                     cards[i] = hand[i];
                }
            }
       return cards;
    }

}

