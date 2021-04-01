package Chapter4;

import java.util.Scanner;

public class Gasmilage {

    public static void main(String[] args) {

        int counter = 0;
        int total = 0;
        int userMile = 0;
        int userGallon = 0;
        Scanner scanner = new Scanner(System.in);
        while (userMile != -1 && userGallon != -1) {
            counter = counter + 1;
            total = total + (userMile + userGallon);
            while (userMile == -1 && userGallon == -1) {
                System.out.println();
            }
            System.out.println("Enter  number of miles driven or -1 to exit:  ");
            userMile = scanner.nextInt();

            System.out.println("Enter number of gallon used or -1 to exit:  ");
            userGallon = scanner.nextInt();


            int combinedMilesPerGallon = userMile / userGallon;
            System.out.println("the miles per galllon used for this trip is " + combinedMilesPerGallon);
   if(userMile == -1 && userGallon == -1){

   }
        }

        double average = (double)total/counter;
        System.out.println("The total of miles per gallon driven for all trip is: " + total);
        System.out.println("The average is: " + average);

    }

}
