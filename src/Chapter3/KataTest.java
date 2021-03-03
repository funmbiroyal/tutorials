public class KataTest {

  public static void main(String[] args) {

      Kata gracey = new Kata();

        System.out.println("The name is " + gracey.name);

        System.out.println("The average is " + gracey.calculateAverage(34, 56, 10));

        System.out.println("Your Grade is " + gracey.CalculateGrade(90));

        System.out.println("Your Grade is " + gracey.CalculateGrade(60));

        System.out.println("Your Grade is " + gracey.CalculateGrade(50));

        System.out.println("Your Grade is " + gracey.Even(0));

        System.out.println("the number is " + gracey.isPrimeNumber(101));

      System.out.println();

      System.out.println("Prices of copies of books");

      System.out.println("The price of 3 copies is : " + gracey.calculatePrice(3));

      System.out.println("The price of 9 copies is : " + gracey.calculatePrice(9));

      System.out.println("The price of 5 copies is : " + gracey.calculatePrice(5));

  }


 }
