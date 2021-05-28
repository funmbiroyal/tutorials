package Chapter7;

import java.util.Scanner;

public class MonthArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] months = {"January","February","March",
                           "April","May","June",
                            "July","August","September",
                             "October","November","December"};

          for(String month: months)
            System.out.println(month);

        System.out.println("Enter number of month from (1-12)");
        int number = scanner.nextInt();
        System.out.println("The month is "+ months[number - 1]);
        System.out.println("---------------");
    }
}
