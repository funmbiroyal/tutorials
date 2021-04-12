import Tdd.Employee;

public class CommissionPlusEmployee extends Employee {
    private double commissionSalary;
    public CommissionPlusEmployee(String firstName, String lastName, int socialSecurityNumber,double commissionSalary)
    {
        super(firstName,lastName,socialSecurityNumber);
        if(commissionSalary <= 0.00)
            throw new IllegalArgumentException("Invalid commission Salary, enter a valid integer!");
        this.commissionSalary = commissionSalary;
    }
    public void setCommissionSalary(double commissionSalary){
        if(commissionSalary <= 0.00)
            throw new IllegalArgumentException("Please enter a valid integer");
        this.commissionSalary = commissionSalary;
    }
    public double getCommissionSalary(){
        return commissionSalary;
    }
}
