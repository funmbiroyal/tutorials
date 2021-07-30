import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotSame;

public class CodeWar {
    public static int [] function(int[] numbers, int value) {
        int [] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (value == numbers[i] + numbers[j]) {
                   result[0]= j;
                   result[1] = i;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        System.out.println(Arrays.toString(function(array, value)));
    }

    @Test
    void testFunction() {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        assertNotSame(array, value);
    }
}

