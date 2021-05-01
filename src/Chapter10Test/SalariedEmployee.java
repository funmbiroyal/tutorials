package Chapter10Test;

import Tdd.Employee;

public class SalariedEmployee extends Employee {
   private final int salary;
   private int day;
   private int month;
   private int year;

    public  SalariedEmployee(String firstName,String lastName, int socialSecurityNumber,int salary, int day,
                             int month, int year){
        super(firstName,lastName,socialSecurityNumber);
            if(salary < 0) throw new IllegalArgumentException("Salary must be greater than zero");
                this.salary = salary;
                this.day = day;
                this.month = month;
                this.year = year;

    }

    public int getSalary() {

        return salary;
    }

    public int getDateOfBirth(){
        return day / month / year;
    }
    @Override
    public int earnings() {
        return salary;
    }

}