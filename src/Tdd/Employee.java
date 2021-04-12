package Tdd;

public class Employee extends Object {
    private int socialSecurityNumber;
    private String firstName;
    private String lastName;

    public  Employee(String firstName, String lastName, int socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

}
    public String getFirstName() {
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
        return String.format(
                "%s: %s%s%n,%s%d%n ",
                "Employee", firstName, lastName,
                "social security number", socialSecurityNumber);
    }
}