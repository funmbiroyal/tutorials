package Chapter7;

public class SalesCommission {

    private int[] array = new int[9];

    public double calculateGrossPay(int weeklyEarning, int amountOfItemSold) {
        double percentage = amountOfItemSold * 0.09;
        double result = weeklyEarning + percentage;
        return result;
    }

    public void setArray(int[] array) {
        this.array = array;

    }

    public void verifyWeeklyEarning(int weeklyEarning) {
        if (weeklyEarning < 200) {
            System.out.println("Invalid weekly earning, it is 200!");
        }
    }

    public int [] determineSalaryRange(int grossPay) {
        if (grossPay >= 200 && grossPay < 300) {
            ++array[0];

        } else if (grossPay >= 300 && grossPay < 400) {
            ++array[1];

        } else if (grossPay >= 400 && grossPay < 500) {
            ++array[2];

        } else if (grossPay >= 500 && grossPay < 600) {
            ++array[3];

        } else if (grossPay >= 600 && grossPay < 700) {
            ++array[4];

        } else if (grossPay >= 700 && grossPay < 800) {
            ++array[5];

        } else if (grossPay >= 800 && grossPay < 900) {
            ++array[6];

        } else if (grossPay >= 900 && grossPay < 1000) {
            ++array[7];

        } else if (grossPay >= 1000) {
            ++array[8];
        }
        return array;
    }
    public void displayResult(){
        String result = """
                 $200–299
                 $300–399
                 $400–499
                 $500–599
                 $600–699
                 $700–799
                 $800–899
                 $900–999
                 $1,000 and over
                """;

        System.out.printf("%s%10s%n","Salary Range", "SalesPeople");
        System.out.printf("%d%n",result);
    }
}
