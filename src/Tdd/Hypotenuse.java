package Tdd;

public class Hypotenuse {
    private int value;
    private double hypotenuse;

    public void enterValue(int value) {
//        if(value <= 0)
//            throw new IllegalArgumentException("Can not take zero or less than");
        if(value > 0)
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void calculateHypotenuse(double side1,double side2) {
        double hypotenuse = Math.sqrt(Math.pow(side1,2)+ Math.pow(side2,2));
        this.hypotenuse = hypotenuse;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }
}
