package Tdd;

public class SalesCommission {
    private double input;


    public void enterInput(double input) {

        this.input = input;
    }

    public double getInput() {

        return input;
    }


    public double getPercentageOfAmountOfItemSold() {
       double percentage = (input * 0.09);
        return percentage;
    }

    public double getTotalEarning() {
        double totalEarning = 200 + getPercentageOfAmountOfItemSold();
        return totalEarning;
    }
}
