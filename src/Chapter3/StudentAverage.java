import java.util.Scanner;
public class StudentAverage {
    public static void main(String[] args) {
        Scanner space = new Scanner (System.in);
                int totalScore = 0;
        int NumberOfInputsCollected = 0;

        while (NumberOfInputsCollected < 3) {
            System.out.println("Enter grade");
            int userGrade = space.nextInt();
            totalScore = totalScore + userGrade;
            NumberOfInputsCollected ++;

        }
        double average = totalScore/(NumberOfInputsCollected * 1.0);
        System.out.println("Total of all grades is " + average);
    }






}
