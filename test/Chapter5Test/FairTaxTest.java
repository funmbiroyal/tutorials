package Chapter5Test;

import Chapter5.FairTax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FairTaxTest {
    FairTax fairTax ;
    @BeforeEach
    void startEachTestWith(){
        fairTax = new FairTax();
    }
    @Test
    void FairTaxCanBeCreatedTest(){
        assertNotNull(fairTax);
    }
    @Test
    void canDisplayExpensesForUserTest(){
        String message = """
                welcome dear user
                enter your expenses as follows
                press
                1. Housing
                2. Food
                3. Clothing
                4. Transportation
                5. Education
                6. Health Care
                7. Vacation
                """;
        assertEquals(message,fairTax.displayMessages());
    }
    @Test
    void canEnterExpensesByUser(){
        String message = """
                welcome dear user
                enter your expenses as follows
                press
                1. Housing
                2. Food
                3. Clothing
                4. Transportation
                5. Education
                6. Health Care
                7. Vacation
                """;
        assertEquals(message,fairTax.displayMessages());
        fairTax.enterInput(3);
        assertEquals(3,fairTax.getInput());
    }
    @Test
    void CanNotEnterNegativeInput(){
        String message = """
                welcome dear user
                enter your expenses as follows
                press
                1. Housing
                2. Food
                3. Clothing
                4. Transportation
                5. Education
                6. Health Care
                7. Vacation
                """;
        assertEquals(message,fairTax.displayMessages());
        fairTax.enterInput(-1);
        assertEquals(0,fairTax.getInput());
    }
    @Test
    void canCalculateFairTax(){
       assertEquals(115,fairTax.calculateFairTax(500));
    }
}
