package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
}
