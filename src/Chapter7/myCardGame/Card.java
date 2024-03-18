package Chapter7.myCardGame;

public class Card {
    private final String face;
    private final String suit;
     public Card(String face,String suit){
         this.face = face;
         this.suit = suit;
     }


//    public Card() {
//
//    }


    public String toString(){

         return face + " of " + suit;
     }

    public String getFace() {

         return face;
    }

    public String getSuit() {


         return suit;
    }

//    public Card[] is3Jacks() {
//        Card card = new Card();
//
//
//        String face = card.getFace();
//        Card [] cards = new Card[3];
//        Card [] deck = deckOfCards.populateDeck();
//        if (face.equals("Jack")) {
//            for (int i = 0; i < deck.length ; i++) {
//                if (deck[i].equals(face)) {
//                    deck[i] = cards[i];
//                }
//            }
//        }
//        return cards;
//    }
}
