package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

public class GuessTheNumberTest {
    GuessTheNumber guessTheNumber;
    @Test
    @BeforeEach
    void startEachTestWith(){

        guessTheNumber = new GuessTheNumber();
    }
    @Test
    void GuessTheNumberCanBeCreated(){

        assertNotNull(guessTheNumber);
    }
    @Test
    void canNotEnterNegativeIntegerByTheUser(){
        guessTheNumber.enterInput(-1);
        assertEquals(0,guessTheNumber.getInput());
    }
    @Test
    void canOnlyEnterInputBetweenOne_to_OneThousand(){
        guessTheNumber.enterInput(1001);
        assertEquals(0,guessTheNumber.getInput());

    }

    @Test
    void randNumber() {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 100; i++) {
            int rand = secureRandom.nextInt(100);
            assertNotEquals(-10, rand);
            System.out.println(rand);
        }
    }
}
