package Chapter6Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FindTheMinimumTest {
    FindTheMinimum findTheMinimum;
    @BeforeEach
    void startEachTestWithThis(){
        findTheMinimum = new FindTheMinimum();
    }
    @Test
    void canCreateFindMinimumTest(){
        assertNotNull(findTheMinimum);
    }
    @Test
    void canFindTheMinimum(){
        findTheMinimum.calculateMinimum(45.0,6.0,36.0);
        assertEquals(6.0,findTheMinimum.getMinimum());

    }
}
