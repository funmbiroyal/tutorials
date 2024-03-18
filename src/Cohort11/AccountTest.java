package Cohort11;

import java.security.SecureRandom;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 5; i++) {
            double generatedNumber =  secureRandom.nextDouble();
            System.out.println(generatedNumber);
        }





    }
}
