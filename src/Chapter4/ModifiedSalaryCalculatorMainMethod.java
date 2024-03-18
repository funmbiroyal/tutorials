package Chapter4;

import Tdd.ModifiedSalaryCalculator;

import java.util.Scanner;

public class ModifiedSalaryCalculatorMainMethod {
    public static void main(String[] args) {
        ModifiedSalaryCalculator modifiedSalaryCalculator = new ModifiedSalaryCalculator();
        int userHour = 0;
        int userExcessHour = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are welcome!");
        while (userHour != 40) {

            System.out.println("Enter hours worked: ");
            userHour = scanner.nextInt();
            if (userHour == 40) {
                System.out.printf("%s%d%n", "Your gross pay is ", modifiedSalaryCalculator.getGrossPay());
            } else
                System.out.println("Sorry, it has to be 40 hrs!");
        }
        System.out.println("Did you do excessHour? (yes/no)");
        String userInput = scanner.next();
        if (userInput.equals("yes")) {
            System.out.println("Enter the excess hour(s) worked:");
        } else {
            System.out.println("Transaction Ended!");
        }

        while(userExcessHour >=1 ){
            System.out.printf("%s%d%n", "Your excess gross pay is ", userExcessHour * 100);

            userExcessHour = scanner.nextInt();

             if(userExcessHour == 0 || userExcessHour == -1) {

                 System.out.println("Sorry, enter a valid input");
             }
            int overAllGrossPay = (userExcessHour * 100)+ modifiedSalaryCalculator.getGrossPay();
        System.out.printf("%s%d%n", "Your Overall gross pay is ", overAllGrossPay);
        System.out.println("Thank you for choosing us!");
       // } else
          //  System.out.println("Your excess hour must be greater value");
    }
}
}