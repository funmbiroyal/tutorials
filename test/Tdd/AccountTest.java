package Tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    void can_ReceiveDepositTest(){

      MyAccount account   = new MyAccount();
      account.deposit(5000.00);

      assertEquals(5000.00,account.getBalance());

    }
    @Test
    void can_receiveDepositTwiceTest(){
        MyAccount account   = new MyAccount();
        account.deposit(1000.00);
        account.deposit(5000.00);
        assertEquals(6000.00,account.getBalance());
    }
    @Test
    void can_Withdraw(){
        MyAccount account   = new MyAccount();
        account.withdrawMoney(2500.00);
        assertEquals(3500,account.getBalance());

    }

}




