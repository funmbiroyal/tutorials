package Chapter6Test;

import Chapter6.Distance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class DistanceTest {

    @Test
    void calculateDistanceBetweenPoints(){

        assertEquals(5.0, Distance.calculateDistance(5,6,8,10));
    }
}
