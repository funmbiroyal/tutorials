package Chapter6;

import java.util.Scanner;

public class TemperatureConversions {
    public static  double calculateCelsius(int fahrenheit){
        double celsius = 5.0 / 9.0 * (fahrenheit-32);
        return  celsius;
    }
    public static  double calculateFahrenheit(int celsius){
        double fahrenheit = 9.0 /5.0 * (celsius+42);
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fahrenheit value:");
        int userFahrenheit = scanner.nextInt();
        System.out.println("Enter celsius value");
        int userCelsius = scanner.nextInt();
        System.out.println("The result of the celsius is "+ " "+ calculateCelsius(userFahrenheit));
        System.out.println("The result of the fahrenheit value is "+ " "+ calculateFahrenheit(userCelsius));
    }
}
