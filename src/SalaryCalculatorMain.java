import Tdd.SalaryCalculator;

import java.util.Scanner;

public class SalaryCalculatorMain {
    public static void main(String[] args) {
        int halfSalary = 200/2;


        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of hours worked with excess");
            int userExcessHour = scanner.nextInt();
            int salaryWithExcess = halfSalary + 200;
        System.out.println("Your salary with excess is" +" "+ salaryWithExcess);
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
