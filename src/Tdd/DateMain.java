package Tdd;

public class DateMain {
    public static void main(String[] args) {
        Date date = new Date(29,03,2021);
        System.out.printf("The date is %d/%d/%d%n" , date.getDay(),date.getMonth(),date.getYear());
    }
}
