import Tdd.CreditLimitCalculator;

public class CreditLimitCalculatorMain {
    public static void main(String[] args) {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();

        creditLimitCalculator.setBeginningBalance(100);
        creditLimitCalculator.setCharges(300);
        creditLimitCalculator.setCreditLimits(200);

        System.out.println("Your new balance is "+ creditLimitCalculator.getNewBalance());
        System.out.println(creditLimitCalculator.checkCreditLimit());
        System.out.println();

        creditLimitCalculator.setBeginningBalance(1000);
        creditLimitCalculator.setCharges(300);
        creditLimitCalculator.setCreditLimits(200);
        System.out.println("Your new balance is "+ creditLimitCalculator.getNewBalance());
        System.out.println(creditLimitCalculator.checkCreditLimit());

    }
}
