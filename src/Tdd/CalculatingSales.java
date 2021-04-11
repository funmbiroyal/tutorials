package Tdd;

public class CalculatingSales {
    private int input;
    private double total;

    public void enterInput(int input) {
        if (input >0)
        this.input = input;
    }

    public int getInputValue() {
        return  input;
    }

    public void calculateTotal(double product1,double product2,double product3,double product4,double product5) {
        double total = product1 + product2 + product3 + product4 + product5;
        this.total = total;
    }

    public double getTotal() {

        return total;

    }
}
