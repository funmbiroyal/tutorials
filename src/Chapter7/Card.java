package Chapter7;

public class Card {
   private final Suit2 suit;
    private final int value;
   private Card(Suit2 suit, int value) {

        this.suit = suit;
        this.value = value;
    }

    public static Card createTriangleCardOfValue(int value) {
       Card card = new Card(Suit2.CROSSES,4);
       return card;
    }


    public static Card createCircleCardOfValue(int value){
       Card card = new Card(Suit2.CIRCLES,3);
       return card;
    }

    public static Card createCrossCardOfValue(int value) {
        return new Card(Suit2.CROSSES,2);
    }

    public static Card createSquareCardOfValue( int value) {
       Card card = new Card(Suit2.SQUARES,1);
       return card;
    }

    public static Card createStarCardOfValue( int value) {
       Card card = new Card(Suit2.STARS,4);
       return card;
    }

    public static Card createWhotCardOfValue(int value) {
       Card card = new Card(Suit2.WHOT,6);
       return card;
    }

    public Suit2 getSuit() {
        return suit;
    }
//  @Override
//   public String toString() {
//       return getValue() + " of " + suit.toString();
//   }

  @Override
  public boolean equals(Object obj) {
     if(!this.getClass().equals(obj.getClass())){
            return false;
        }
     Card cardToCompare = (Card) obj;
     return this.value == cardToCompare.value || this.suit == cardToCompare.suit;
   }
}
