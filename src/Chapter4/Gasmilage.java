package Chapter4;

import java.util.Scanner;

public class Gasmilage {
    public static void main(String[] args) {
        int userMile = 0;
        int userGallon = 0;
      Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter  number of miles driven:  ");
//        userMile = scanner.nextInt();
//        System.out.println("Enter number of gallon used:  ");
//        userGallon = scanner.nextInt();
//        int combinedMilesPerGallon = userMile * userGallon;
//        System.out.println("the miles per galllon used for this trip is "+ combinedMilesPerGallon);

        String prompt = """
                press 1 for trip one
                press 2 for trip two
                press 3 for trip three
                press 4 for trip four
                press 5 for trip five
                """;
        System.out.println(prompt);
        int trip = 5;
        switch (trip){
            case 1:

                System.out.println("Enter  number of miles driven:  ");
               userMile = scanner.nextInt();
                System.out.println("Enter number of gallon used:  ");
                userGallon = scanner.nextInt();
                int combinedMilesPerGallon = userMile * userGallon;
                System.out.println("you used  "+ combinedMilesPerGallon + "for trip 1");
                break;
            case 2:

                System.out.println("Enter  number of miles driven:  ");
                int userMile2 = scanner.nextInt();
                System.out.println("Enter number of gallon used:  ");
                 int userGallon2 = scanner.nextInt();
                int combinedMilesPerGallon2 = userMile * userGallon;
                System.out.println("the miles per galllon used for this trip is "+ combinedMilesPerGallon2);
                break;
            case 3:

                System.out.println("Enter  number of miles driven:  ");
               int userMile3 = scanner.nextInt();
                System.out.println("Enter number of gallon used:  ");
              int  userGallon3 = scanner.nextInt();
                int combinedMilesPerGallon3 = userMile * userGallon;
                System.out.println("the miles per galllon used for this trip is "+ combinedMilesPerGallon3);





        }
    }



}

