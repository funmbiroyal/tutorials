package Chapter7;

import java.util.Scanner;

public class SalesCommissionMain {
    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weekly earning: ");

        int userWeeklyEarning = scanner.nextInt();
        salesCommission.verifyWeeklyEarning(userWeeklyEarning);

        while (userWeeklyEarning!= 0){

            System.out.println("Enter gross sales:  ");
            int userGrossSales = scanner.nextInt();

            System.out.println("Enter your weekly earning: ");
            userWeeklyEarning = scanner.nextInt();
            salesCommission.verifyWeeklyEarning(userWeeklyEarning);

            double grossPay = salesCommission.calculateGrossPay(userWeeklyEarning,userGrossSales);
          salesCommission.determineSalaryRange((int) grossPay);
          //salesCommission.displayResult();
        }

    }
}
