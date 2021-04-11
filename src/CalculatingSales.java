import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        double product1 = 2.98;
        double product2 =4.50;
        double product3 = 9.98;
        double product4 =4.49;
        double product5 = 6.87;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are welcome to our Soap mart!");
        System.out.println("Here are our product numbers and prices");
        String message = """
                For product 1, the price is , $2.98,
                 For product 2, the price is , $4.50,
                 For product 3, the price is , $9.98,
                 For product 4, the price is , $4.49,
                 For product 5, the price is , $6.87,
                """;
        System.out.println(message);
        int userInput= 0;

        while (userInput != -1){
            System.out.println("Enter the price of product sold : ");
            userInput = scanner.nextInt();

        }
        double total = product1 + product2 + product3 + product4 + product5;
        System.out.println("The total of items sold is  " + total);
    }

    }

