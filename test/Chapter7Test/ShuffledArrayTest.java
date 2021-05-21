package Chapter7Test;

import Chapter7.Kata;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffledArrayTest {


    @Test
    void canShuffleArray() {
      int [] array = {3, 4, 6, 7, 9};
        Kata kata = new Kata();
        kata.shuffle(array);
        assertNotSame(Arrays.toString(array),array);

    }
}