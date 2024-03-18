package Extras;

public class ArithmeticProgression {

    public static int generateSequenceOfNumbers(int number1,int number2) {
        return number1 + number2;

    }

    public static int nextNumber(int number1, int number2) {
        return generateSequenceOfNumbers(number1,number2);

    }

    public void generateUpToTheFifthTerm(int number) {
        for (int i = 0; i < 5 ; i++) {
            number++;

        }

    }

//    public int getNextFiveTerms(int i) {
//    }
public static void main(String[] args) {

    System.out.println(nextNumber(4,6));
}
}
