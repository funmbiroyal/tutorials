package Tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    @Test
    @DisplayName("Test for Addition")
    void addTwoNumbersTest() {

        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Test for Multiplication")
    void multiplyTwoNumbersTest() {

        Calculator calculator = new Calculator();
        assertEquals(9, calculator.multiply(3, 3));
    }

    @Test
    @DisplayName("Test for division")
    void divideTwoNumbersTest() {

        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10, 2));

    }


      @Test
      @DisplayName("Test for float return")
      void divideTwoNumbersToYieldFloatResult(){

      Calculator calculator = new Calculator();
      assertEquals(2.5, calculator.divide (5,2));

       }
    @Test
    @DisplayName("Division by zero return")
    void divisionByZeroTest() {

        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(10, 0));

    }
    @Test
    void difference_toBeCalculated(){
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.subtract(10,5));

    }
    @Test
    void difference_willProduceAbsoluteResult(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtract(5,10));


    }
}



