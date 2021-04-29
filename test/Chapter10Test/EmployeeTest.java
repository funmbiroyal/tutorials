package Chapter10Test;

import Chapter10.Payroll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PayrollTest {
    Payroll payroll;
@BeforeEach
void startEachTestWith(){
    payroll = new Payroll("Grace","Ola",56);
}
    @Test
    void PayrollCanBeCreated(){
        assertNotNull(payroll);
    }
    @Test
    void canGetFirstName(){
    assertEquals("Grace",payroll.getFirstname());
    }
    @Test
    void canGetLastName(){
    assertEquals("Ola",payroll.getLastName());
    }
    @Test
    void canGetSocialSecurityNumber(){
    assertEquals(56,payroll.getSecurityNumber());
    }
@Test
    void canPrintToString(){
    assertEquals(toString(),payroll.toString());

}
}
