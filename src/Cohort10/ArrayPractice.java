package Cohort10;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] numbers = new int[5];
//  System.out.printf("%s%10s%n","index","numbers");
        try {
            numbers[0] = 2;
            numbers[1] = 3;
            numbers[2] = 9;
            numbers[3] = 69;
            numbers[4] = 5;
            numbers[5] = 5;
        }catch (ArrayIndexOutOfBoundsException exception){
//            exception.printStackTrace();
        }

        for (int number:numbers) {
            System.out.println(number);

        }

        }

    }

