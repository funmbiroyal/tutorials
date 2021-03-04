package Tdd;

public class MyAccount {

    double balance;
    int pin;

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        }
    }


    public double getBalance() {

        return balance;
    }


    public void withdrawMoney(double withdraw, int pin) {
        if (balance >= 0.0 && pin == 5911) {
            balance -= withdraw;
        }
        else{
            balance =  balance;
        }

    }

    public void setPin(int pin) {
        this.pin = pin;

    }


    public int getPin(){
        return pin;

    }


}






