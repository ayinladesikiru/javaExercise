package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BankTest {

    private Bank firstBank;
    @BeforeEach
    public void startWith(){
        firstBank = new Bank("firstBank", 10);
    }
    @Test
    public void bankCanBeCreated(){
        assertNotNull(firstBank);
        assertEquals("firstBank", firstBank.getName());
        assertEquals(10, firstBank.getMaximumOfCustomers());
    }

    @Test
    public void registerCheckForCustomerTest(){
        firstBank.register("joy", "messi", "0102");
        firstBank.register("joy", "mark", "0102");
        firstBank.register("jenny", "messi", "0102");
        firstBank.register("joy", "messi", "0102");
        assertEquals(4, firstBank.getNumberOfCustomers());

    }

}
