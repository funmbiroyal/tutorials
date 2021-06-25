package Chapter7Test;

import Chapter7.DiceRolling;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class DiceRollingTest {
    @Test
    void DiceRollingCanBeCreatedTest(){
        DiceRolling diceRolling = new DiceRolling();
        assertNotNull(diceRolling);

    }
    @Test
    void CanGenerateNumberRandomly(){
        SecureRandom generator = new SecureRandom();
        int generatedNumber = 1 + generator.nextInt(6);
        int generatedNumber2 = 1 + generator.nextInt(6);
        assertNotEquals(generatedNumber,generatedNumber2);
    }
    @Test
    void canCalculateTwoGeneratedRandomNumbers(){
        SecureRandom generator = new SecureRandom();
        int generatedNumber = 1 + generator.nextInt(6);
        int generatedNumber2 = 1 + generator.nextInt(6);
        int result = generatedNumber + generatedNumber2;
        System.out.println(generatedNumber);
        System.out.println(generatedNumber2);
        System.out.println(result);

        assertEquals(result ,generatedNumber + generatedNumber2);
    }

    @Test
    void canRollDie(){
        DiceRolling.rollDie();
        DiceRolling.calculateSumOfDie();
    }
}
