package Chapter10;

public class Payroll {
    private String firstName;
    private String lastName;
    private int securityNumber;

    public Payroll(String firstName, String lastName, int securityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    @Override
    public String toString(){
        System.out.println(getFirstname());
        System.out.println(getLastName());
        System.out.println(getSecurityNumber());
        return String.format("%s%n%s%n the security number is %s%n",
                getFirstname(),getLastName(),getSecurityNumber()
        );
    }
}
