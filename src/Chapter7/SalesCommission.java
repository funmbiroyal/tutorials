package Chapter7;

import java.util.Arrays;

public class SalesCommission {
    private int weeklyEarning = 200;
    private int[] array = new int[9];

    public double calculateGrossPay( int amountOfItemSold) {
        double percentage = amountOfItemSold * 0.09;
        double result = this.weeklyEarning + percentage;
        return result;
    }

    public void setArray(int[] array) {
        this.array = array;

    }

    public int [] determineSalaryRange(int grossSales) {
        if (grossSales >= 200 && grossSales < 300) {
            ++array[0];

        } else if (grossSales >= 300 && grossSales < 400) {
            ++array[1];

        } else if (grossSales >= 400 && grossSales < 500) {
            ++array[2];

        } else if (grossSales >= 500 && grossSales < 600) {
            ++array[3];

        } else if (grossSales >= 600 && grossSales < 700) {
            ++array[4];

        } else if (grossSales >= 700 && grossSales < 800) {
            ++array[5];

        } else if (grossSales >= 800 && grossSales < 900) {
            ++array[6];

        } else if (grossSales >= 900 && grossSales < 1000) {
            ++array[7];

        } else if (grossSales >= 1000) {
            ++array[8];
        }
        return array;
    }
    public void printArray(){
        System.out.println(Arrays.toString(array));
    }
    public void displayResult(){
//        String result = """
//                 Salary Range
//                 $200–299
//                 $300–399
//                 $400–499
//                 $500–599
//                 $600–699
//                 $700–799
//                 $800–899
//                 $900–999
//                 $1,000 and over
//                """;
//
//        System.out.printf("%s%20s%n","Salary Range", "SalesPeople");
//        System.out.printf("%s%s%n",result,Arrays.toString(array));
        //System.out.printf("%s%10s%n%7s%n%7s%n%7s%n%7s%n%7s%n%7s%n%7s%n%7s%n","Salary Range","SalesPeople","$200–299","$300–399","$400–499","$500–599","$600–699","$700–799","$800–899","$900–999");
        for (int element : array){
            System.out.printf("%12d%n",element);
        }
//        for(int i = 0; i< array.length; i++){

//            System.out.print(array[i] + " \n");
//
//        }
    }
}
