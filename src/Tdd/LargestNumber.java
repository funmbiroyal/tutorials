package Tdd;

public class LargestNumber {
    private int input;
    private int largestNumber;

    public void enterInput(int input) {
        if(input > 0)
        this.input = input;
    }

    public int getInput() {
        return  input;
    }

    public int getLargestNumber() {
        return  largestNumber;
    }

    public void calculateLargestNumber(int number1,int number2, int number3) {
      largestNumber = number1;
      if(number2 > number1 ) largestNumber = number2;
      if(number3 > number2)  largestNumber = number3;
    }
}
