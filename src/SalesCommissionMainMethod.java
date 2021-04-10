import java.util.Scanner;

public class SalesCommissionMainMethod {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int weeklyEarning =200;
        for (int i = 1; i <=5; i++) {

            System.out.println("Enter the amount for item sold: ");
        double userInput = scanner.nextDouble();
        double percentage = userInput* 0.09;
            System.out.println("your commission on the item sold is" + " " +percentage);
            System.out.println("Your weekly earning is" + " " + weeklyEarning +" "+ "dollars");
        double result = 200 + (userInput* 0.09);
        System.out.println("Your total earning for this week is" + " " + result);

        }
        }
    }
