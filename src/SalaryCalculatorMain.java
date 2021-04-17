import Tdd.SalaryCalculator;

import java.util.Scanner;

public class SalaryCalculatorMain {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {


            System.out.println("Enter numbers of hours worked last week");
            int userHours = scanner.nextInt();
            System.out.println("Our salary for 40hrs is " + salaryCalculator.getGrossPay());
            if (userHours == 40) {
                System.out.println("Your pay is " + salaryCalculator.getGrossPay());
            } else if (userHours > 40) {
                salaryCalculator.calculateGrossPayWithExcess(userHours);
                System.out.println("Your pay is " + salaryCalculator.getGrossPayWithExcess());
            }
        }
    }
}