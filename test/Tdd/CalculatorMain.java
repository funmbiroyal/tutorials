package Tdd;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInputCollector = new Scanner (System.in);
        String prompt = """
                Hello User,
                Welcome to lasu Calculator.
                -> Enter 1 for Addition.
                -> Enter 2 for Absolute Subtraction
                -> Enter 3 for Multiplication.
                -> Enter 4 for Division.
                
                """;
        System.out.println("prompt");
        int userChoice = userInputCollector.nextInt();
        System.out.println("Enter your first number: ");
        int firstNumber = userInputCollector.nextInt();
        System.out.println("Enter your second number: ");
        int secondNumber = userInputCollector.nextInt();

        switch (userChoice) {
            case 1 -> System.out.println(calculator.add(firstNumber, secondNumber));
            case 2 -> System.out.println(calculator.subtract(firstNumber, secondNumber));
            case 3 -> System.out.println(calculator.multiply(firstNumber, secondNumber));
            case 4 -> System.out.println(calculator.divide(firstNumber, secondNumber));
            default -> System.out.println("Enter something reasonable");
        }



    }




}
