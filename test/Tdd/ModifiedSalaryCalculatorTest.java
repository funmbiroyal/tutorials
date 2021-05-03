package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ModifiedSalaryCalculatorTest {
    ModifiedSalaryCalculator modifiedSalaryCalculator;
    @BeforeEach
    void startAllTestWith(){
        modifiedSalaryCalculator = new ModifiedSalaryCalculator();
    }
    @Test
    void modifiedSalaryCalculatorCanBeCreatedTest(){
         ModifiedSalaryCalculator modifiedSalaryCalculator = new ModifiedSalaryCalculator();
         assertNotNull(modifiedSalaryCalculator);
    }
    @Test
    void userCannotEnterNegativeHoursTest(){
        modifiedSalaryCalculator.enterHoursWorked(-5);
        assertEquals(0,modifiedSalaryCalculator.getHoursWorked());
    }
    @Test
    void userCannotEnterHoursLessThanFortyTest(){
        modifiedSalaryCalculator.enterHoursWorked(30);
        assertEquals(0,modifiedSalaryCalculator.getHoursWorked());
    }
    @Test
    void salaryForFortyHoursCanBeCalculated(){
        modifiedSalaryCalculator.enterHoursWorked(40);
        assertEquals(200,modifiedSalaryCalculator.getGrossPay());
    }
    @Test
    void salaryForFortyHoursWithExcessCanBeCalculatedTest(){
        modifiedSalaryCalculator.enterHoursWorked(40);
        assertEquals(200,modifiedSalaryCalculator.getGrossPay());
        modifiedSalaryCalculator.calculateGrossPayWithExcess(5,100);
        assertEquals(500,modifiedSalaryCalculator.getGrossPayForHoursWorkedWithExcess());

    }
    @Test
    void grossPayCanBeSummedWithExcessTest(){
        modifiedSalaryCalculator.enterHoursWorked(40);
        assertEquals(200,modifiedSalaryCalculator.getGrossPay());
        modifiedSalaryCalculator.calculateGrossPayWithExcess(5,100);
        assertEquals(500,modifiedSalaryCalculator.getGrossPayForHoursWorkedWithExcess());
        modifiedSalaryCalculator.sumGrossPayWithExcess();
        assertEquals(700,modifiedSalaryCalculator.sumGrossPayWithExcess());
    }
}
