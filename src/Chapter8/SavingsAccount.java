package Chapter8;

public class SavingsAccount {
    private double savingBalance;
    private static int annualInterestRate;
    private String name;


    public SavingsAccount(String name, double savingBalance){
        this.name = name;
        this.savingBalance = savingBalance;

    }

    public static void modifyInterestRate(int annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }


    public double calculateMonthlyInterestRate() {
        savingBalance = (int) (savingBalance * annualInterestRate / 12);
        return savingBalance;
    }


}
