package Chapter7.myCardGameTests;

import Chapter7.myCardGame.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CardTest {
    @Test
    void createCardTest(){
        Card card = new Card("face","suit");
        assertNotNull(card);
    }
}
