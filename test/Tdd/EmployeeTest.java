package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeTest {
    Employee employee;

    @Test
    @BeforeEach
    void startAllTestWith(){

        employee = new Employee("Jane","Brown",345);
    }
    @Test
    void canCreateEmployee(){

        assertNotNull(employee);
    }
    @Test
    void canGetFirstName(){

        assertEquals("Jane",employee.getFirstName());
    }
    @Test
    void canGetLastName(){
        assertEquals("Brown",employee.getLastName());
    }
    @Test
    void canGetSocialSecurityNumber(){
        assertEquals(345,employee.getSocialSecurityNumber());
    }

}
