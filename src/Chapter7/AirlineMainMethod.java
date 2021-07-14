package Chapter7;

import java.util.Scanner;

public class AirlineMainMethod {
    public static void main(String[] args) {
        Airline airline = new Airline();
        Passenger passenger = new Passenger(012,"lilly","smart");
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        do {
            String prompt = """
                Hi,Welcome to Java Airline!...
                ------------------------------
                for Economy  Class, press 1.
                for First Class, press 2.   
                """;
            System.out.println(prompt);
            userChoice = scanner.nextInt();
            if (userChoice == 1){
                passenger.bookSeat(false,airline);
            }else if (userChoice == 2){
                passenger.bookSeat(true,airline);
            }else{
                System.out.println("Invalid Input!");
            }


        } while (userChoice != 0);


    }
}
