package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {
    private MyAccount account;
    @BeforeEach
    void startEachTestWith(){
         account = new MyAccount() ;
    }

    @Test
    void can_ReceiveDepositTest(){

      account.deposit(5000.00);

      assertEquals(5000.00,account.getBalance());

    }
    @Test
    void can_receiveDepositTwiceTest(){
        account.deposit(1000.00);
        account.deposit(5000.00);
        assertEquals(6000.00,account.getBalance());
    }
    @Test
    void can_Withdraw(){
        account.deposit(3000.00);
        account.withdrawMoney(2500.00, 5911);
        assertEquals(500,account.getBalance());

    }
    @Test
    void can_WithdrawWithPinTest(){
        account.setPin(5911);
        assertEquals(5911,account.getPin());

    }
    @Test
    @DisplayName("You can't withdraw with wrong pin")
    void can_notWithdrawWithWrongPinTest(){
        account.deposit(10000.00);
        account.withdrawMoney(4000.00,5911);
        assertEquals(6000.00, account.getBalance());

    }
    @Test
    void calculatorCanCalculateAgeTest(){


    }

}




