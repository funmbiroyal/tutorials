package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LargestNumberTest {
    LargestNumber largestNumber;
    @BeforeEach
    void startEachTestWith(){
        largestNumber = new LargestNumber();
    }
    @Test
    void canCreateLargestNumberTest(){
        assertNotNull(largestNumber);
    }
    @Test
    void userCanNotEnterNonNegativeIntegerTest(){
        largestNumber.enterInput(-1);
        assertEquals(0,largestNumber.getInput());
    }
    @Test
    void canCalculateTheLargestNumber(){
        largestNumber.calculateLargestNumber(34,303,26);
        assertEquals(303,largestNumber.getLargestNumber());
    }
}
