package Tdd;

public class ModifiedSalaryCalculator {
    private int hoursWorked;
    private  int hoursWorkedWithExcess;
    private int excessGrossPay;

    public void enterHoursWorked(int hoursWorked) {
        if(hoursWorked == 40)
        this.hoursWorked = hoursWorked;
    }

    public int getGrossPay() {
        int grossPay = 200;
        return grossPay;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void enterHoursWorkedWithExcess(int hoursWorkedWithExcess) {
        if(hoursWorkedWithExcess > 40)
        this.hoursWorkedWithExcess = hoursWorkedWithExcess;
    }

    public int getGrossPayForHoursWorkedWithExcess() {
        return excessGrossPay;
    }

    public void calculateGrossPayWithExcess(int hoursWorkedWithExcess, int halfGrossPay ) {
        int grossPayWithExcess = 0;
       grossPayWithExcess = hoursWorkedWithExcess * halfGrossPay;
this.excessGrossPay = grossPayWithExcess;
        }

    public int sumGrossPayWithExcess() {
        int overAllSum = excessGrossPay + getGrossPay();
        return overAllSum;
    }
}

