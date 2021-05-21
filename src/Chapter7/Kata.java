package Chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class Kata {
    SecureRandom randomGenerator = new SecureRandom();

    public void shuffle(int [] array) {
        for (int i = 0; i < array.length ; i++) {
            int generatedRandomNumber = randomGenerator.nextInt(array.length);
            int store = array[generatedRandomNumber];
            array[generatedRandomNumber] = array[i];
            array[i]=store;

        }
        System.out.println(Arrays.toString(array));

    }
}
