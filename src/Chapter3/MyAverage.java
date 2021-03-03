import java.util.Scanner;

public class MyAverage {
    public static void main(String[] args) {
        Scanner spin = new Scanner(System.in);
        int total = 0;
        int numberOfInputs = 0;

        System.out.println("Enter your grade");
        int input = spin.nextInt();

        while ( input > 0 && input <= 100) {
            total = total + input ;
            numberOfInputs++;

            System.out.println("Enter your grade");
            input = spin.nextInt();
        }
        double average = (total * 1.0) / numberOfInputs;
        System.out.println(average);

    }
}
           // while (numberOfInputs != 0) {
             //
               // System.out.println("the total number of grade is" + total);
                //System.out.println("the average is" + average);

            //}



        //}










