package Tdd;

public class CreditLimitCalculator {
    private int newBalance;
    private int beginningBalance;
    private int charges;
    private int creditLimits;

    public void calculateNewBalance() {

        newBalance = beginningBalance + charges - creditLimits;
    }

    public void setBeginningBalance(int beginningBalance) {
        if(beginningBalance > 0)
            this.beginningBalance = beginningBalance;
    }

    public void setCreditLimits(int creditLimits) {
        if(creditLimits > 0)
            this.creditLimits = creditLimits;
    }

    public void setCharges(int charges) {
        if (charges > 0)
          this.charges = charges;
    }

    public int getNewBalance() {
        return newBalance;
    }

    public String checkCreditLimit() {
        if(newBalance > creditLimits)
            return "You have exceeded your credit Limits";
        else
            return "Your are within the credit limits";
    }
}
