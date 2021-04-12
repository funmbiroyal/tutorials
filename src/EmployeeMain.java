import Tdd.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Jane","Brown",0052);
        System.out.println("Employee Information");
        System.out.printf("The first name of the employee is %s%n ",employee.getFirstName());
        System.out.printf("The last name of the employee is %s%n " ,employee.getLastName());
        System.out.printf("The social security number of the employee is %d%n ",employee.getSocialSecurityNumber());
        System.out.println();
        System.out.printf("Updated employee information obtained by toString %s%n" , employee);

    }

}
