public class Kata {

    private int copies;
    private int price;
    public String name = "Grace";

    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) * 1.0 / 3.0;
        return average;

    }


    public String CalculateGrade(int grade) {

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

    public boolean Even(int num) {
        if (num % 2 == 0)
            return true;
        else {
            return false;
        }

    }

    public boolean isPrimeNumber(int numberToCheckForPrime) {
        int counter = 2;
        while (counter < numberToCheckForPrime) {
            if ((numberToCheckForPrime % counter == 0)) {
                return false;
            }
            counter++;

        }
        return true;


    }


    public int calculatePrice(int copies) {

        if (copies > 0 && copies <= 4) {
            return 1500 *copies;

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
}


