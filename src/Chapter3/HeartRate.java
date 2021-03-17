package Chapter3;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private  int month;
    private  int day;
    private  int year;




    public HeartRate(String firstName, String lastName, int dateOfBirth, int month,int day,int year){
            this.firstName= firstName;
            this.lastName= lastName;
            this.dateOfBirth = dateOfBirth;
            this.month = month;
            this.year = year;
            this.day = day;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
    public void setLastName(String lastNameName){
        this.lastName = lastName;
    }
    public void setDateOfBirth(int dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getFirstName(){
            return firstName;
    }


    public String getLastName() {
            return lastName;
    }

    public int getDateOfBirth() {
            return dateOfBirth;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public int getLocalDate(int localDate){
       return localDate;
    }
}
