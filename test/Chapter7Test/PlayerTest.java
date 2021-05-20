package Chapter7Test;

import Chapter7.Card;
import Chapter7.Player;
import Chapter7.Suit;
import org.junit.jupiter.api.Test;

import static Chapter7.Suit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void playerHasAnId(){
        Player player = new Player("Henry Mike");
        assertEquals("Henry Mike",player.getPlayer());

    }
    @Test
    void playerHasCards(){
        Player player = new Player("Henry Mike");
        player.addCards(new Card(CLUB,3));
        player.addCards(new Card(DIAMOND,6));
        player.addCards(new Card(HEART,9));
        player.addCards(new Card(SPADE,4));
        player.addCards(new Card(DIAMOND,6));
        assertEquals(5,player.getNumberOfCards());
    }
}
