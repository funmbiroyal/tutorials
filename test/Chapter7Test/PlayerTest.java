//package Chapter7Test;
//
//import Chapter7.Card;
//import Chapter7.Player;
//import org.junit.jupiter.api.Test;
//
//import static Chapter7.Suit.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class PlayerTest {
//    @Test
//    void playerHasAnId(){
//        Player player = new Player("Henry Mike");
//        assertEquals("Henry Mike",player.getPlayer());
//
//    }
//    @Test
//    void playerHasCards(){
//        Player player = new Player("Henry Mike");
//        player.addCards(new Card(SQUARES,3));
//        player.addCards(new Card(CIRCLES,6));
//        player.addCards(new Card(TRIANGLES,9));
//        player.addCards(new Card(CROSSES,4));
//        player.addCards(new Card(CIRCLES,6));
//        assertEquals(5,player.getNumberOfCards());
//    }
//}
