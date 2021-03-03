public class EmployeeTest{
  public static void main (String[] args){

Employee gracey = new Employee("Grace", "Ajadi", 55.21);
Employee gracei = new Employee("better","best", 45.10);

        gracey.setFirstName("Grace");
	gracey.setLastName("Donald");
	gracey.setMonthlySalary(250.00);	
	
	gracei.setFirstName("Jane");
	gracei.setLastName("Green");
	gracei.setMonthlySalary(200.00);	

	
	
System.out.printf("My  employee1 first name is %s%n", gracey.getFirstName());
System.out.printf("My employee1 last name is %s%n", gracey.getLastName());
System.out.printf("Her monthly salary is $%.2f", gracey.getMonthlySalary());
System.out.println();

System.out.printf("Her yearly salary is $%.2f", gracey.getYearlySalary());

	gracey.increment();
System.out.println();
System.out.println("Her monthly salary with 10% is " + gracey.getMonthlySalary());
System.out.println("Her yearly salary is now " + gracey.getYearlySalary());
System.out.println();


System.out.printf("My employee2 first name is %s%n", gracei.getFirstName());
System.out.printf("My employee2 last name is %s%n", gracei.getLastName());
System.out.printf("Her monthly salary is $%.2f", gracei.getMonthlySalary());
System.out.println();
System.out.printf("Her yearly salary is $%.2f", gracei.getYearlySalary());
System.out.println();
	gracei.increment();

System.out.println("Her monthly salary with 10 % is"+ gracei.getMonthlySalary());
System.out.println("Her yearly salary is now " + gracei.getYearlySalary());
	










}

}


























