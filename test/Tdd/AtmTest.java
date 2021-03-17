package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmTest {
    private MyAtm atm = new MyAtm();
    @BeforeEach
    void StartEachTestWith(){
        atm = new MyAtm();
    }


    @Test
    void depositMoney(){
        atm.depositMoney(5000.00);
        assertEquals(5000.00, atm.getBalance());
    }
    @Test
    void withdrawMoney(){
        atm.depositMoney(5000.00);
        atm.withdrawMoney(2000.00, 2090);
        assertEquals(3000.00, atm.getBalance());
    }

    @Test
    void transferMoney(){
        atm.depositMoney(10000.00);
        atm.TransferMoney(5000.00);
        assertEquals(5000.00, atm.getBalance());


    }

    @Test
    void setPin(){
        atm.setPin(2090);
        assertEquals(2090, atm.getPin());


    }



    }


