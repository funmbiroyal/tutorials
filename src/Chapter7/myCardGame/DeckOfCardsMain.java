package Chapter7.myCardGame;

import java.util.ArrayList;
import java.util.Arrays;

public class DeckOfCardsMain {
    public static void main(String[] args) {
     DeckOfCards myDeckOfCards = new DeckOfCards();
     myDeckOfCards.shuffle();
     for(int i = 1; i <= 52; i++){
         System.out.printf("%-19s",myDeckOfCards.dealCard());
         if (i % 4==0)
             System.out.println();
     }
        System.out.println();
        System.out.println("The five poker cards dealt are: ");
        System.out.println(Arrays.toString(myDeckOfCards.dealHand()));
    }

}
