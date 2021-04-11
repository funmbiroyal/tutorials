package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatingSalesTest {
    CalculatingSales calculatingSales;

    @BeforeEach
    @Test
    void startEveryTestWith(){
        calculatingSales = new CalculatingSales();
    }

    @Test
    void calculatingSalesCanBeCreated(){
        assertNotNull(calculatingSales);
    }
    @Test
    void userCannotEnterNegativeValues(){
calculatingSales.enterInput(-1);
assertEquals(0,calculatingSales.getInputValue());
    }
    @Test
    void calculateTotalAmountsOfProducts(){
        calculatingSales.calculateTotal(34,45,56,67,78);
        assertEquals(280.00,calculatingSales.getTotal());
    }
}
