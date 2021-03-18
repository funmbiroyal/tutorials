package Tdd;

import Chapter3.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

   @Test
    void canSumArrayTest(){
       int [] array = {1,2,3};
       assertEquals(6,Kata.getSum(array));


   }


    }





















//    private Kata kata = new Kata();
//    @BeforeEach
//    void startAllTestWith()
//    {
//        kata = new Kata();
//    }
//
//
//    @Test
//    void canGetMaximumArrayTest() {
//        int[] array = {12, 23, 45, 6, 8, 78, 9, 778, 37};
//        int maximumNumber = kata.getMaximumNumber(array);
//        assertEquals(778, maximumNumber);
//
//    }
//    @Test
//    void canGetMinimumArrayTest(){
//        int[] array = {12, 23, 45, 6, 8, 78, 9, 778, 37};
//        int minimumNumber = kata.getMinimumNumber(array);
//        assertEquals(6, minimumNumber);
//    }
//
//    @Test
//    void canSumArrayTest(){
//        int [] array = {10,20,67};
//        int sum = kata.getSum(array);
//        assertEquals(97, sum);
//    }
//
//    @Test
//    void canGetAverageArrayTest(){
//        int [] array ={ 10,23,10,5};
//                                                                                                                                                                                                                                                                                                     double average = kata.getAverage(array);
//        assertEquals(12.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ,average);
//    }
//}