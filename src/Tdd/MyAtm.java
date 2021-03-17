package Tdd;

public class MyAtm {


    private double balance;
    private int pin = 2090;

    public void depositMoney(double amount) {
        if (amount > 0.0) {
            balance = balance + amount;
        }
            if (amount <= 0.0) {
                balance = balance + 0;
            }
        }



    public double getBalance() {
        return balance;
    }

    public void withdrawMoney(double withdraw, int pin) {
        if (withdraw > 0.00 && pin == this.pin) {
            balance = balance - withdraw;
        }
            if (withdraw <= 0.00 && pin != 2090){
                System.out.println("Insufficient balance");
        }
    }

    public void TransferMoney(double transfer) {
        if (transfer > 0.00) {
            balance = balance - transfer;
        }
            if (transfer <= 0.00) {
               this. balance = balance + 0 ;
            }

        }



    public void setPin(int pin) {
        if (pin > 0)
            this.pin = pin;

       // if (pin != pin)
        // {
           // System.out.println("Invalid pin");
       // }
    }


        public int getPin() {
            return pin;
    }


    }
