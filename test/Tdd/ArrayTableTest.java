package Tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTableTest {
    //private void assertArrayEquals(int[][] array, int outputArray) {

    //private ArrayTableTest arrayTable;

    @Test
    void array_canBeCreatedTest() {
        int[][] array = {{6, 7, 6}, {5, 8, 0}, {3, 6, 8}};

        assertNotNull(array);

    }
}

//@Test
//    void array_canBeOutputtedTest(){
//    int [][] array = {{6,7,6},{5,8,0},{3,6,8}};
//    assertEquals( [3],[3][3]);



