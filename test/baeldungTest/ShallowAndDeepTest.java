package baeldungTest;

import baeldungCode.DeepCopy;
import baeldungCode.ShallowCopy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShallowAndDeepTest {
    @Test
    void testShallowCopyUnitTest() {
        ShallowCopy copy1 = new ShallowCopy();
        ShallowCopy copy2 = copy1;
        copy2.number = 10;
        assertEquals(10, copy1.number);
        assertEquals(10, copy2.number);
    }

    @Test
    public void testDeepCopyUnitTest() {
        DeepCopy copy1 = new DeepCopy();
        DeepCopy copy2 = new DeepCopy();
        copy2.number = 10;
        assertNotSame(copy1, copy2);
        assertEquals(10, copy2.number);
        assertEquals(50, copy1.number);
    }
}