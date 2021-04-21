import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile healthProfile = new HealthProfile("Grace","Fumbi","female",50,
                75,23,10,1995);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = scanner.next();
        healthProfile.setFirstName(firstName);

        System.out.println("Enter your last name : ");
        String lastName = scanner.next();
        healthProfile.setLastName(lastName);

        System.out.println("Enter your gender : ");
        String gender = scanner.next();
        healthProfile.setGender(gender);

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();
        healthProfile.setHeight(height);

        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();
        healthProfile.setWeight(weight);

        System.out.println("Enter your day of Birth: ");
        int dayOfBirth = scanner.nextInt();
        healthProfile.setDayOfBirth(dayOfBirth );

        System.out.println("Enter your month of Birth: ");
        int monthOfBirth = scanner.nextInt();
        healthProfile.setMonthOfBirth(monthOfBirth );

        System.out.println("Enter your year of Birth: ");
        int yearOfBirth = scanner.nextInt();
        healthProfile.setYearOfBirth(yearOfBirth);

        System.out.println("These are your Health Profile details : ");
        System.out.println("Name: " + healthProfile.getFirstName() + " " + healthProfile.getLastName());

        System.out.println("Gender: " + healthProfile.getGender());

        System.out.println("Height: " + healthProfile.getHeight());

        System.out.println("Weight: " + healthProfile.getWeight());

        System.out.println("Date of Birth: " + healthProfile.getDateOfBirth());

        System.out.println("Age: " + healthProfile.getAge() + " years old");

        System.out.println("Body Mass Index: " + healthProfile.getBodyMassIndex(weight,height));

        System.out.println("Your maximum heart rate is: " + healthProfile.getMaximumHeartRate());

        System.out.println("Your target heart rate is: " + healthProfile.getTargetHeartRate());

        System.out.println("BMI Values\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29\nObese: 30 or greater");


    }
}
