package Chapter6Test;

import Chapter6.Conversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTest {
    @Test
    void convertNumber(){

        assertEquals(56,Conversion.convertNumber(56));
    }
}
