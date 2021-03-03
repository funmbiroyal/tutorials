package Tdd;

public class MyAccount {
    double balance;

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        }
    }


    public double getBalance() {

        return balance;
    }


    public void withdrawMoney(double withdraw) {
        if(balance >=0.0) {
            balance -= withdraw;
        }

    }
}







