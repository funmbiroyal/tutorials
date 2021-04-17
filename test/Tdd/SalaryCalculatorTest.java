package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalaryCalculatorTest {
    SalaryCalculator salaryCalculator;

    @BeforeEach
    void startAllTestWith() {
        salaryCalculator = new SalaryCalculator();
    }

    @Test
    void canCreateSalaryCalculatorTest() {
        assertNotNull(salaryCalculator);
    }

    @Test
    void canNotEnterNegativeValuesTest() {
        salaryCalculator.enterValue(-1);
        assertEquals(0, salaryCalculator.getValue());
    }

    @Test
    void canCalculateGrossPayForEmployeeThatWorkedForFortyHoursTest() {
        salaryCalculator.setHours(40);
     assertEquals(200,salaryCalculator.getGrossPay());
    }
@Test
    void canCalculateGrossPayForEmployeeThatWorkedMoreThanFortyHoursTest(){
    salaryCalculator.calculateGrossPayWithExcess(150);
    assertEquals(300,salaryCalculator.getGrossPayWithExcess());
}
}