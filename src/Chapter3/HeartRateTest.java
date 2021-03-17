package Chapter3;

import java.time.LocalDate;

public class HeartRateTest {
    public static void main(String[] args) {
        //LocalDate localDate = new LocalDate();
        HeartRate heartRate = new HeartRate("Doris", "Emeka",12-12-2020,12,12,2020);

        System.out.println("My full name is " + heartRate.getFirstName() + " " + heartRate.getLastName());
        System.out.println("I was born on day " + heartRate.getDay());
        System.out.println("month " + heartRate.getMonth());
        System.out.println("In the year " + heartRate.getYear());
    }
}

