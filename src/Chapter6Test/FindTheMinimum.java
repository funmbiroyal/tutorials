package Chapter6Test;

public class FindTheMinimum {
    private double minimum = 0;

    public double getMinimum() {
        return minimum;
    }

    public void calculateMinimum(double firstNumber,double secondNumber,double thirdNumber ) {
        minimum = Math.min(Math.min(firstNumber,secondNumber),thirdNumber );
    }
}
