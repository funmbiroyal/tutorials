package Chapter3;

public class Kata {


    private int copies;
    private static int price;
    public String name = "Grace";


    public static double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) * 1.0 / 3.0;
        return average;

    }


    public static String calculateGrade(int grade) {

        if (grade >= 90) {
            return "A";
        }

        if (grade >= 80) {
            return "B";
        }

        if (grade >= 70) {
            return "C";
        } else
            return "F";
    }

    public static boolean Even(int num) {
        if (num % 2 == 0)
            return true;
        else {
            return false;
        }

    }

    public static boolean isPrimeNumber(int numberToCheckForPrime) {
        int counter = 2;
        while (counter < numberToCheckForPrime) {
            if ((numberToCheckForPrime % counter == 0)) {
                return false;
            }
            counter++;

        }
        return true;


    }


    public static int calculatePrice(int copies) {

        if (copies > 0 && copies <= 4) {
            return 1500 * copies;

        }

        if (copies > 4 && copies <= 9) {
            return 1400 * copies;
        }

        if (copies > 9 && copies <= 29) {
            return 1200 * copies;
        }

        if (copies > 29 && copies <= 59) {
            return 1000 * copies;
        }


        return price;
    }


    public static int getSum(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
               sum += array[i];
        }
        return sum;
    }

}

//    public static int getMaximumNumber(int[] array) {
//        int maximumNumber = array[array.length-1];
//        for (int i = 1; i < array.length ; i++) {
//            maximumNumber = Math.max(array[i],maximumNumber);
//        }
//        return maximumNumber;
//    }
//
//
//    public int getMinimumNumber(int[] array) {
//        int minimumNumber = array[0];
//        for (int i = 0; i < array.length; i++) {
//            minimumNumber = Math.min(array[i], minimumNumber);
//        }
//        return minimumNumber;
//
//        }
//
//    public int getSum(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length ; i++) {
//            sum += array[i];
//        }
//        return sum;
//    }
//
//    public double getAverage(int[] array) {
//        int sum;
//        int average = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = getSum(array);
//             average  =  sum/array.length ;
//        }
//        return average;
//    }
//}
//
//
//
