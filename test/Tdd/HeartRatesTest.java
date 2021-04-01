package Tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRatesTest {
    @Test
    void HeartRate_ProfileCanBeCreatedTest() {
        HeartRates heartRates = new HeartRates(C);
        assertNotNull(heartRates);
    }

    @Test
    void firstName_CanBeCreatedTest() {
        HeartRates heartRates = new HeartRates();
        heartRates.setFirstname();
        assertEquals(Grace,heartRates.getFirstname());

    }


    }
}