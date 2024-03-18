package Tdd;

import Chapter6.CoinTossing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static Chapter6.CoinState.HEAD;
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
        SecureRandom secureRandom = new SecureRandom();
        int generatedNumber = secureRandom.nextInt(2);

        assertEquals(HEAD,coinTossing.getCurrentCoinState());
    }
}
