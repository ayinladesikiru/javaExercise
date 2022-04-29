package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccTest {
    Acc amaka;
    Acc Asa;

    @BeforeEach
    public void startWith(){
        amaka = new Acc("213445", "foodie", "chiamaka", "2122");
        Asa = new Acc("242424", "ade", "wunmi", "0101");
    }

    @Test
    public void createAccount(){
        assertNotNull(amaka);
        assertNotNull(Asa);
        assertEquals(213445, amaka.getAccountNumber());
        assertEquals("foodie chiamaka", amaka.getAccountName());
        assertEquals(242424, Asa.getAccountNumber());
        assertEquals("ade wunmi,", Asa.getAccountName());
    }

   @Test
    public void gettingBalanceWithRightPin(){
        amaka.deposit(500);
        amaka.deposit(1000);
        assertEquals(1500, amaka.getBalance("2022"));
        Asa.deposit(2000);
        Asa.deposit(5000);
        assertEquals(7000, Asa.getBalance("2003"));
   }

   @Test
    public void withdrawalWithTheRightPin(){
        amaka.deposit(5000);
        assertEquals(5000, amaka.getBalance("2122"));

        Asa.deposit(10000);
        assertEquals(10000, Asa.getBalance("0101"));

        amaka.withdrawal(2000, "2122");
        assertEquals(3000, amaka.getBalance("2122"));
        Asa.withdrawal(5000, "0101");
   }
}
