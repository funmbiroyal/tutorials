package Chapter3;


public class DateTest{
  public static void main (String[] args) {

      Date displayDate = new Date(10, 25, 2020);

      System.out.printf("The date is %s/%s/%s%n ", displayDate.getMonth(), displayDate.getDay(),
              displayDate.getYear());
  }
}