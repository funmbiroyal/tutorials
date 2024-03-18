package Chapter5;
import java.util.Scanner;

public class FairTaxMainMethod {
    public static void main(String[] args) {
        FairTax fairTax = new FairTax();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Dear User!,Kindly select the appropriate option.");

        String message = """
                1. Housing
                2. Food
                3. Clothing
                4. Transportation
                5. Education
                6. Health Care
                7. Vacation
                """;

        System.out.println(message);
        System.out.println("Enter a number");
        validateOptionChoice(scanner);
        System.out.println("How much is your expense?");
        double expenseAmount = scanner.nextDouble();
        System.out.println("your tax is" + " " + fairTax.calculateFairTax(expenseAmount) + " " + "naira");


        String userString;
        do {
            System.out.println("Do you still want to do something else(yes/no)");
            userString = scanner.next();

            if (userString.equalsIgnoreCase("yes")) {
                System.out.println(message);
                System.out.println("Enter your number");
                validateOptionChoice(scanner);
                System.out.println("How much is your expense?");
                expenseAmount = scanner.nextDouble();
                System.out.println("your tax is" + " " + fairTax.calculateFairTax(expenseAmount) + " " + "naira");

            }

        }while(userString.equalsIgnoreCase("yes"));

            System.out.println("Transaction ended,Thank You!");
    }

    private static void validateOptionChoice(Scanner scanner) {
        int userInput = scanner.nextInt();;

        while (userInput < 1 || userInput > 7) {
            System.out.println("Invalid number, Enter number between 1 and 7");
            userInput = scanner.nextInt();
        }
    }
}

