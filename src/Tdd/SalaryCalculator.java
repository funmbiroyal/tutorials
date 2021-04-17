package Tdd;

public class SalaryCalculator {
    private int value;
    private int grossPay = 200;
    private int hours = 40;
    private int grossPayWithExcess;

    public void enterValue(int value) {
        if(value > 0) this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void calculateGrossPay(int grossPay) {
        if(hours == 40)
       this .grossPay = grossPay;

    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getGrossPay() {

        return grossPay;
    }

    public void calculateGrossPayWithExcess(int hours) {
        if (hours > this.hours)
            grossPayWithExcess = grossPay+ (grossPay/2);

    }
    public int getGrossPayWithExcess(){
        return grossPayWithExcess;
    }

}
