import Tdd.CreditLimitCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreditLimitCalculatorTest {
    CreditLimitCalculator creditLimitCalculator;
    @BeforeEach
    void StartEachTestWith(){
        creditLimitCalculator = new CreditLimitCalculator();
    }
    @Test
    void canCreateCreditLimitCalculator(){

        assertNotNull(creditLimitCalculator);
    }
    @Test
    void canCalculateNewBalance(){
        creditLimitCalculator.setBeginningBalance(100);
        creditLimitCalculator.setCreditLimits(200);
        creditLimitCalculator.setCharges(300);
        creditLimitCalculator.calculateNewBalance();
        assertEquals(200,creditLimitCalculator.getNewBalance());
        }
        @Test
        void canNotSetNegativeValues(){
        creditLimitCalculator.setBeginningBalance(-100);
        creditLimitCalculator.setCreditLimits(-200);
        creditLimitCalculator.setCharges(-300);
        creditLimitCalculator.calculateNewBalance();
        assertEquals(0, creditLimitCalculator.getNewBalance());
        }
        @Test
    void canCheckCreditLimit(){
            creditLimitCalculator.setBeginningBalance(1000);
            creditLimitCalculator.setCreditLimits(200);
            creditLimitCalculator.setCharges(300);
            creditLimitCalculator.calculateNewBalance();
            assertEquals("You have exceeded your credit Limits", creditLimitCalculator.checkCreditLimit());
        }

}

