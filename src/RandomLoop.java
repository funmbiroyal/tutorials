import java.util.Random;

public class RandomLoop {
    public static void main(String[] args) {
     Random random = new Random();
     int[] array = new int[6];
        for (int number = 1;  number <= 20; number++) {
            ++array [1+ random.nextInt(5)];
        }
        System.out.printf("%s%7s%n" ,"number", "values");
        for (int number = 1; number < array.length; number++) {
            System.out.printf("%2d%6d%n",number,array[number]);
        }
        }
    }

