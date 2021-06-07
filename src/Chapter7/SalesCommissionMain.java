package Chapter7;

import java.util.Scanner;

public class SalesCommissionMain {
    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();

        Scanner scanner = new Scanner(System.in);
        int userGrossSales = 0;
        double grossPay;

        while (userGrossSales != -1) {
            System.out.println("Enter gross sales:  ");
            userGrossSales = scanner.nextInt();
            grossPay = salesCommission.calculateGrossPay(userGrossSales);
            salesCommission.determineSalaryRange((int) grossPay);
        }


            salesCommission.displayResult();



    }
}