package Tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesCommissionTest {
    SalesCommission salesCommission;

    @BeforeEach
    @Test
    void startEachTestWith() {
        salesCommission = new SalesCommission();
    }

    @Test
    void salesCommissionCanBeCreated() {
        SalesCommission salesCommission = new SalesCommission();
        assertNotNull(salesCommission);
    }

    @Test
    void userCanEnterInputInIntegers() {
        SalesCommission salesCommission = new SalesCommission();
        salesCommission.enterInput(230.00);
        assertEquals(230.00, salesCommission.getInput());
    }

    @Test
    void percentageOfSalesCanBeCalculated() {
        salesCommission.enterInput(230.00);
        assertEquals(20.7, salesCommission.getPercentageOfAmountOfItemSold());
    }

    @Test
    void percentageCanBeAddedWithTheWeeklyEarning() {
        salesCommission.enterInput(230.00);
        salesCommission.getPercentageOfAmountOfItemSold();
        assertEquals(220.7,salesCommission.getTotalEarning());


    }
}


