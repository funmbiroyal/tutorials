package Chapter10Test;

import Tdd.Employee;

public class SalariedEmployee extends Employee {
   private final int salary;

    public  SalariedEmployee(String firstName,String lastName, int socialSecurityNumber,int salary){
        super(firstName,lastName,socialSecurityNumber);
            if(salary < 0) throw new IllegalArgumentException("Salary must be greater than zero");
                this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}