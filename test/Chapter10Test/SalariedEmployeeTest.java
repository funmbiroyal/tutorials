package Chapter10Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalariedEmployeeTest {
    SalariedEmployee salariedEmployee;
    @BeforeEach
    void startAllTestWith(){
       salariedEmployee = new SalariedEmployee("Lara",
               "George",5678,10000);
    }
    @Test
    void salariedEmployeeCanBeCreated(){
    assertNotNull(salariedEmployee);
}
    @Test
    void CanGetFirstName (){
    assertEquals("Lara",salariedEmployee.getFirstName());
    }

    @Test
    void CanGetLastName (){
        assertEquals("George",salariedEmployee.getLastName());
    }
    @Test
    void CanGetSocialSecurityNumber (){
        assertEquals(5678,salariedEmployee.getSocialSecurityNumber());
    }
    @Test
    void canGetSalary(){
        assertEquals(10000,salariedEmployee.getSalary());
    }
}