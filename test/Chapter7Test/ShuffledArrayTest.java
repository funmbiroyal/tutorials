package Chapter7Test;

import Chapter7.Kata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffledArrayTest {
    Kata kata;
@BeforeEach
void startEachTestWith(){
    kata = new Kata();
}

    @Test
    void canShuffleArray() {
      int [] array = {3, 4, 6, 7, 9};
      kata.shuffle(array);
        assertNotSame(Arrays.toString(array),array);

    }
    @Test
    void canSortArrayInAscendingOrder(){
        int [] array = {7,6,5,3,4,1};
        kata.sortInAscendingOrder(array);
        assertNotSame(Arrays.toString(array),array);
    }
    @Test
    void canSortArrayInDescendingOrder(){
        int [] array = {7,9,3,1,5,8,2};
        kata.sortInDescendingOrder(array);
        assertNotSame(Arrays.toString(array),array);
    }
}