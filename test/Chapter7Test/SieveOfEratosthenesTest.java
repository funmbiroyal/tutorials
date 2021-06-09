package Chapter7Test;

import Chapter7.SieveOfEratosthenes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SieveOfEratosthenesTest {
    @Test
    void canCreateSieveOfEratosthenes(){

        SieveOfEratosthenes prime = new SieveOfEratosthenes();
        assertNotNull(prime);
   }
   @Test
   void canFindPrimeNumber(){
        boolean []  numbers = new boolean[20];
       Arrays.fill(numbers,true);
       assertTrue(numbers[3]);
       SieveOfEratosthenes.findPrimeNumber(numbers);
       for(int i = 0; i < numbers.length; i ++){
           System.out.println(numbers[i] ? i : "Not prime");
       }
    }
}
