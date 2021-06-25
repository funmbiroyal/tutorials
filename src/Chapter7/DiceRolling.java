package Chapter7;

import java.security.SecureRandom;

public class DiceRolling {
    public static int rollDie() {
        SecureRandom generator = new SecureRandom();
        int generatedNumber = generator.nextInt(6);
        int generatedNumber2 = generator.nextInt(6);
        int result = generatedNumber + generatedNumber2;
        return result;
    }

    public static int calculateSumOfDie() {
        int sum = 0;
        sum =  rollDie();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSumOfDie());
    }
}
