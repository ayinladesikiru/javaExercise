package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){

    // given
        Account funmiAccount = new Account();
    // when
        funmiAccount.deposit(10000);
        funmiAccount.deposit(15000);
    // assert
        assertEquals(25000, funmiAccount.getBalance());

    }

    @Test
    public void depositTwiceTest(){

        Account funmiAccount = new Account();
        funmiAccount.deposit( 500);
        funmiAccount.deposit(  400);
        assertEquals(  500+400, funmiAccount.getBalance());

    }

    @Test
    @DisplayName("Test that negative deposit wil not work")
    public void negativeDepositTest(){
        Account funmiAccount = new Account();
        funmiAccount.deposit( 5000);
        funmiAccount.deposit( -500);

        assertEquals( 5000, funmiAccount.getBalance());
    }

    @Test
    public void withdrawTest(){
        Account funmiAccount = new Account();
        funmiAccount.deposit(5000);
        funmiAccount.getWithdrawBalance(2000);

    assertEquals(3000, funmiAccount.getBalance());
    }

    @Test
    public void minWithdrawtest(){
        Account funmiAccount = new Account();
        funmiAccount.deposit(3000);
        funmiAccount.getWithdrawBalance(2000);
        funmiAccount.minimumWithdraw(2000);

        assertEquals(1000, funmiAccount.getBalance());

    }


}

