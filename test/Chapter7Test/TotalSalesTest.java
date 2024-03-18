package Chapter7Test;

import Chapter7.SalesPerson;
import Chapter7.Slip;
import Chapter7.TotalSales;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TotalSalesTest {
    TotalSales totalSales;

    @BeforeEach
    void startEachTestWith(){
        totalSales = new TotalSales();
    }
    @Test
    void CanAddAllProductsTest(){
//        totalSales.addBreadSales();
//        totalSales.addEggSales();
//        totalSales.addOatmealSales();
//        totalSales.addButterSales();

        totalSales.calculateColumn1();
        totalSales.calculateColumn2();
        totalSales.calculateColumn3();
        totalSales.calculateColumn4();
        totalSales.calculateColumn5();

//        assertArrayEquals(totalSales.display(),);
    }
}
