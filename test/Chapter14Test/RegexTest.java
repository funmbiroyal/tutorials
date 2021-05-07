package Chapter14Test;

import Chapter14.Regex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegexTest {
    @Test
    void regexCanBeCreatedTest(){
        Regex regex = new Regex();
        assertNotNull(regex);
    }
    @Test
    void canValidateFirstname(){
        assertEquals(true,Regex.validateFirstname("Grace"));
    }
    @Test
    void  canValidateLastNameTest(){
        assertEquals(true,Regex.validateLastname("Peter-ross"));
    }
    @Test
    void canValidateAddressTest(){
     assertEquals(true,Regex.validateAddress("5244 Herbert Macaulay"));
    }
    @Test
    void canValidateCityTest(){
        assertEquals(true,Regex.validateCity("Sabo Yaba"));
    }
    @Test
    void canValidateStateTest(){
        assertEquals(true,Regex.validateState("Lagos"));
    }
    @Test
    void canValidateZipTest(){
        assertEquals(true,Regex.validateZip("346"));
    }
    @Test
    void canValidatePhoneNumber(){
        assertEquals(true,Regex.validatePhoneNumber("+234-632-414-56"));
       // assertEquals(true,Regex.validatePhoneNumber("236-561-7890"));
    }
}
