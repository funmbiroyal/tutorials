package Chapter2;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        System.out.println("Body Mass Index Calculator");
            Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 10 ; i++) {

            System.out.println("Enter your weight in pounds: ");
            int weightInPounds = scanner.nextInt();
        System.out.println("Enter your height in inches: ");
       int heightInInches = scanner.nextInt();
      int BMI = (weightInPounds * 703)/ (heightInInches* heightInInches);
        System.out.println("Your body mass index is " + BMI);
        if(BMI < 18 ){
            System.out.println("You are underweight");
        }
        if(BMI > 17 && BMI< 25){
            System.out.println("You are normal");
        }
        if(BMI > 24 && BMI < 30){
            System.out.println("You are overweight");
        }
        if (BMI >= 30){
            System.out.println("You are obese, kindly watch your weight");
        }
    }
        System.out.println("You have exceeded your limit");
    }
}
