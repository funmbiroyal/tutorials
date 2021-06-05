package Chapter7Test;

import Chapter7.SalesCommission;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalesCommissionTest {
    SalesCommission salesCommission;
    @BeforeEach
    void startEachTestWith(){
        salesCommission = new SalesCommission();
    }
    @Test
    void SalesCommissionCanBeCreated(){
        assertNotNull(salesCommission);
    }
    @Test
    void canCalculateGrossPay(){
      assertEquals(650.00,salesCommission.calculateGrossPay(200,5000));
    }
    @Test
    void canCreateArrayOfCounters(){
        salesCommission.verifyWeeklyEarning(200);
       salesCommission.determineSalaryRange(500);
    }
}
