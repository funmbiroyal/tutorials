package Chapter14;

import java.util.Scanner;

public class RegexMainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String userFirstname = scanner.nextLine();

        System.out.println("Enter your last name:");
        String userLastname = scanner.nextLine();

        System.out.println("Enter your address:");
        String userAddress = scanner.nextLine();

        System.out.println("Enter your city:");
        String userCity = scanner.nextLine();

        System.out.println("Enter your state:");
        String userState = scanner.nextLine();

        System.out.println("Enter your Zip code:");
        String userZip = scanner.nextLine();

        System.out.println("Enter phone Number:");
        String userPhoneNumber = scanner.nextLine();
        System.out.println("Validating Result......................");
        System.out.printf("\n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",userFirstname,userLastname,userAddress,userCity,userState,userZip,userPhoneNumber);

        if (!Regex.validateLastname(userLastname)) {
            System.out.println("Invalid lastname  ---- XXXXXXXXX");

        }
        if (!Regex.validateAddress(userAddress)) {
            System.out.println("Invalid address ---- XXXXXXXXX");

        }
        if (!Regex.validateCity(userCity)) {
            System.out.println("Invalid City ---- XXXXXXXXX");

        }
        if (!Regex.validateState(userState)) {
            System.out.println("Invalid State ---- XXXXXXXXX");

        }
        if (!Regex.validateZip(userZip)) {
            System.out.println("Invalid Zip ---- XXXXXXXXX");

        }
        if (!Regex.validatePhoneNumber(userPhoneNumber))
            System.out.println("Invalid phone number ---- XXXXXXXXX");



        }
    }
