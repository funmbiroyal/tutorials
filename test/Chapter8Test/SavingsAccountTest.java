package Chapter8Test;

import Chapter8.SavingsAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SavingsAccountTest {
    SavingsAccount saver1;
    SavingsAccount saver2;
    @BeforeEach
    void startEachTestWith(){
        saver1 = new SavingsAccount("John",2000.00);
        saver2 = new SavingsAccount("Bessie",3000.00);
    }
    @Test
    void savingsAccountCanBeCreatedTest(){
        SavingsAccount savingsAccount = new SavingsAccount("John",340);
        assertNotNull(savingsAccount);
    }
    @Test
    void canCalculateMonthlyInterestRateForSaver1Test(){
        SavingsAccount.modifyInterestRate(4);
        assertEquals(666, saver1.calculateMonthlyInterestRate());
    }

    @Test
    void canCalculateMonthlyInterestRateForSaver2Test(){
        SavingsAccount.modifyInterestRate(4);
        assertEquals(1000, saver2.calculateMonthlyInterestRate());
    }
    @Test
    void canCalculateMonthlyInterestRateForSaver1WhenAt5percentTest(){
        SavingsAccount.modifyInterestRate(5);
        assertEquals(833, saver1.calculateMonthlyInterestRate());

    }
    @Test
    void canCalculateMonthlyInterestRateForSaver2WhenAt5PercentTest(){
        SavingsAccount.modifyInterestRate(5);
        assertEquals(1250, saver2.calculateMonthlyInterestRate());
    }
}
