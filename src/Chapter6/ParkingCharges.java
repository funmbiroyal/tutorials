package Chapter6;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FeeFor3hrs = 200;
    int additionalCharge = 10;
    //Provided user parked for 3hrs and additional 2hrs
        int userCharge = 200+10+10;
        System.out.println("Welcome to Champion park");
        System.out.println("Fee for 3hrs is :" + " "+ FeeFor3hrs);
        System.out.println("Additional charges :"+ " "+ additionalCharge);
        System.out.println("Enter the hours parked : ");
        int userHour = scanner.nextInt();
        if (userHour > 0 && userHour <=24) System.out.println(userCharge);
        else
            System.out.println("Please enter hour in the range of 1-24");
}
}