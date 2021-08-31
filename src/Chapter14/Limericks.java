package Chapter14;

import java.security.SecureRandom;
import java.util.Arrays;

public class Limericks {
    public static void main(String[] args) {
        SecureRandom randomGenerator = new SecureRandom();
        int [] limerick = new int[5];
        for (int i = 0; i < 5; i++) {

        int generatedNumber = 5 + randomGenerator.nextInt(10);
          limerick[i] = generatedNumber;
              limerick[1] = limerick[0];
              limerick[4] = limerick[0];
              limerick[2] = limerick[3];

            }
        System.out.println(Arrays.toString(limerick));
        }
}