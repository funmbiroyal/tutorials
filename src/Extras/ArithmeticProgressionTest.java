package Extras;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArithmeticProgressionTest {
    ArithmeticProgression arithmeticProgression;
    @BeforeEach
    void startEachTestWith(){
        arithmeticProgression = new ArithmeticProgression();
    }
    @Test
    void ArithmeticProgressionCanBeCreatedTest(){
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression();
        assertNotNull(arithmeticProgression);
    }
    @Test
    void canGenerateSequenceOfNumbersTest(){
        arithmeticProgression.generateSequenceOfNumbers(1,3);
        assertEquals(4, arithmeticProgression.nextNumber(1,3));
    }
    //@Test
//    void canGenerateNumbersUpTheFifthTerm(){
//        arithmeticProgression.generateUpToTheFifthTerm(1);
//        assertEquals(2,3,4,5,6,arithmeticProgression.getNextFiveTerms(1));
//    }
}
