package Chapter10;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    public Employee(String firstName, String lastName, int securityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = securityNumber;
    }

    public String getFirstname() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getSocialSecurityNumber() {

        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%n the security number is %s%n",
                getFirstname(),getLastName(), getSocialSecurityNumber()
        );
    }

    public abstract double earnings() ;
}
