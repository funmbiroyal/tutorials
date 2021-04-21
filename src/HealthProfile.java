import java.time.LocalDate;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int dateOfBirth;
    private int age;
    private double height;
    private double weight;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HealthProfile(String firstName, String lastName, String gender, double height,
                         double weight, int dayOfBirth, int monthOfBirth, int yearOfBirth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return  dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
    }

    public int getAge() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - yearOfBirth;

    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public int getMaximumHeartRate(){
        int maximumHeartRate = 220 - getAge();
        return  maximumHeartRate;
    }
    public String getTargetHeartRate(){
        double fiftyPercent = 0.5 * getMaximumHeartRate();
        double eightyFivePercent = 0.85 * getMaximumHeartRate();
        return  fiftyPercent + " - " + eightyFivePercent;
    }
    public double getBodyMassIndex(double weight, double height){
        double BMI = (weight * 703)/ (height* height);
        return  BMI;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
