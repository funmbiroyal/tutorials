package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Tdd.CoinState.HEAD;
import static org.junit.jupiter.api.Assertions.*;

public class CoinTossingTest {
    CoinTossing coinTossing;
    @Test
    @BeforeEach
    void startEachTestWith(){

        coinTossing = new CoinTossing();
    }
    @Test
    void canCreateCoinTossing(){

        assertNotNull(coinTossing);
    }
    @Test
    void canFlipCoin(){
        coinTossing.flipCoin();
        assertTrue(coinTossing.isHead());
    }
}
