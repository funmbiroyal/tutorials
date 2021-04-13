package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HypotenuseTest {
    Hypotenuse hypotenuse;
    @Test
    @BeforeEach
    void startAllTestWith(){
        hypotenuse = new Hypotenuse ();
    }
    @Test
    void canCreateHypotenuse(){
        assertNotNull(hypotenuse);
    }
    @Test
    void cannotTakeZeroOrNegativeValue(){
        hypotenuse.enterValue(-2);
        assertEquals(0,hypotenuse.getValue());
    }
    @Test
    void canCalculateHypotenuse(){
        hypotenuse.calculateHypotenuse(3.0, 4.0);
        assertEquals(5.0, hypotenuse.getHypotenuse());
    }
}
