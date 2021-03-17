import Tdd.MyAtm;

import java.util.Scanner;

public class MyAtmMain {
    public static void main(String[] args) {
        MyAtm mainAtm = new MyAtm();
        System.out.println("Welcome to Royalty Bank");

        System.out.println();
        String prompt = """
                press 1 to Create pin
                press 2 to Withdraw
                press 3 to Deposit
                press 4 to Transfer
                press 5 to Recharge
                press 6 to check  balance
                press 7 to end Transaction
               
                """;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int userPrompt = input.nextInt();

        for (; userPrompt != -1; )

        {


            switch(userPrompt)
            {
                case 1:
                     int createPin;
                     int confirmPin;
                    System.out.println("Create your pin");
                    createPin = input.nextInt();

                    mainAtm.setPin(createPin);
                    System.out.println("Confirm your pin");
                    confirmPin = input.nextInt();

                    mainAtm.setPin(confirmPin);
                    if (confirmPin == createPin) {
                        System.out.println("Pin Set Succesfully");
                        System.out.println();
                    }
                    if (createPin != confirmPin) {
                        System.out.println("Invalid pin, you can only confirm the pin you have created!");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter your withdrawal amount");
                    double withdrawAmount = input.nextDouble();
                    System.out.println("Thank you for transacting, Your balance is " + mainAtm.getBalance());
                    break;
                case 3:
                    System.out.println("Enter your deposit Amount");
                    double depositAmount = input.nextDouble();
                    System.out.println("Thank you for transacting, Your balance is " + mainAtm.getBalance());

                    break;
            }
            System.out.println(prompt);
            userPrompt = input.nextInt();
        }

    }





}





