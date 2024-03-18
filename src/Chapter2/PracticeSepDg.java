package Chapter2;

import java.util.Scanner;

public class PracticeSepDg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 6 digits");
     int message = scanner.nextInt();
     int firstDigit = message/100000;
     int firstStore = message%100000;
     int secondDigit = firstStore/10000;
     int secondStore = firstStore%10000;
     int thirdDigit =secondStore/1000;
     int thirdStore = secondStore%1000;
     int fourthDigit = thirdStore/100;
     int fourthStore = thirdStore%100;
     int fifthDigit = fourthStore/10;
     int fifthStore = fourthStore%10;
     int sixthDigit = fifthStore;

     System.out.println(firstDigit + " " + secondDigit+ " " + thirdDigit+ " "
                + fourthDigit+ " " + fifthDigit+ " " +sixthDigit);

    }
}
