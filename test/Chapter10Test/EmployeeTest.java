package Chapter10Test;

import Chapter10.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
//this unit test is not needed because the Employee class is an abstract class. new object cannot be created!
//the sub class unit test covers for it's superclass because it is not abstract,unlike the super class!
public class EmployeeTest {
    Employee employee;
@BeforeEach
void startEachTestWith(){
    //
    // employee = new Employee("Grace","Ola",56);
}
    @Test
    void PayrollCanBeCreated(){
        assertNotNull(employee);
    }
    @Test
    void canGetFirstName(){
    assertEquals("Grace", employee.getFirstname());
    }
    @Test
    void canGetLastName(){
    assertEquals("Ola", employee.getLastName());
    }
    @Test
    void canGetSocialSecurityNumber(){
    assertEquals(56, employee.getSocialSecurityNumber());
    }
@Test
    void canPrintToString(){
    assertEquals(toString(), employee.toString());

}
}
