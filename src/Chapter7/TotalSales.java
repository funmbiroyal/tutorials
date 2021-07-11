package Chapter7;

import java.util.Scanner;

public class TotalSales {
    Scanner scanner = new Scanner(System.in);
    int [][] sales = new int[6][5];

    public void addSugarSales(){
        int[] productA = sales[0];
        int total = 0;
        for (int i = 0; i < productA.length - 1; i++) {
            System.out.println("How many Sugar sold: ");
            int quantity = scanner.nextInt();
            productA[i] = quantity;
            total += productA[i];
        }
        productA[4] = total;

    }
    public void addOatmealSales(){
     int [] productB = sales[1];
     int total = 0;
        for (int i = 0; i < productB.length - 1; i++) {
            System.out.println("How many Oatmeal sold: ");
            int quantity = scanner.nextInt();
            productB[i] = quantity;
            total += productB[i];
        }
        productB[4] = total;
    }
    public void addButterSales(){
        int [] productC = sales[2];
        int total = 0;
        for (int i = 0; i < productC.length - 1 ; i++) {
            System.out.println("How many Butter sold: ");
            int quantity = scanner.nextInt();
            productC[i] = quantity;
            total += productC[i];
        }
        productC[4] = total;
    }
    public void addBreadSales(){
        int [] productD = sales[3];
        int total = 0;
        for (int i = 0; i < productD.length ; i++) {
            System.out.println("How many Bread sold: ");
            int quantity = scanner.nextInt();
            productD[i] = quantity;
            total += productD[i];
        }
        productD[4] = total;
    }

    public void addEggSales(){
        int [] productE = sales[4];
        int total = 0;
        for (int i = 0; i < productE.length ; i++) {
            System.out.println("How many Egg sold: ");
            int quantity = scanner.nextInt();
            productE[i] = quantity;
            total += productE[i];
        }
        productE[4] = total;
    }
    public void calculateColumn1(){
        int total = 0;
        for (int i = 0; i < sales.length - 1 ; i++) {

            total +=sales[i][0];
        }
        sales[5][0] = total;
    }
    public  void calculateColumn2(){
        int total = 0;
        for(int i = 0; i < sales.length - 1; i++){
            total += sales[i][1];
        }
        sales[5][1] = total;
    }
    public  void calculateColumn3(){
        int total = 0;
        for (int i = 0; i < sales.length - 1 ; i++) {
            total += sales[i][2];
        }
        sales[5][2] = total;
    }
    public void calculateColumn4(){
        int total = 0;
        for (int i = 0; i < sales.length - 1; i++) {
            total+= sales[i][3];
        }
        sales[5][3] = total;
    }
    public void calculateColumn5(){
        int total = 0;
        for (int i = 0; i < sales.length - 1; i++){
            total += sales[i][4];
        }
        sales[5][4] = total;
    }
    public static void main(String[] args) {

      TotalSales salesPeople = new TotalSales();
        salesPeople.addSugarSales();
        salesPeople.addOatmealSales();
        salesPeople.addButterSales();
        salesPeople.addBreadSales();
        salesPeople.addEggSales();

        salesPeople.calculateColumn1();
        salesPeople.calculateColumn2();
        salesPeople.calculateColumn3();
        salesPeople.calculateColumn4();
        salesPeople.calculateColumn5();

        for (int i = 0; i < salesPeople.sales.length; i++) {
            for (int j = 0; j < salesPeople.sales[i].length; j++) {
            System.out.print(salesPeople.sales[i][j] +" ");
            }
            System.out.println();
        }
    }
}


