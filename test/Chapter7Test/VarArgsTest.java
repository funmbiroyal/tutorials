package Chapter7Test;

import Chapter7.VariableArgument;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VarArgsTest {
    @Test
    void variableArgumentCanBeCreated(){
        VariableArgument varArgs  = new VariableArgument();
        assertNotNull(varArgs);
    }
    @Test
    void canCalculateProductOfVariableArgumentList(){
        assertEquals(2000,VariableArgument.calculateProduct(10,10,10,2));
        assertEquals(200,VariableArgument.calculateProduct(10,2,10));
       assertEquals(5760000,VariableArgument.calculateProduct(2,3,4,5,6,4,10,10,10,2));
    }
    @Test
    void canCalculateSumOfVariableArgumentList(){
        assertEquals(187,VariableArgument.calculateSum(34,5,6,7,8,90,37));
    }
}
