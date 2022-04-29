package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AkantTest {

    @Test
    public void depositTest(){
        Akant myAkant = new Akant(1000);
        myAkant.deposit(1000);
        assertEquals(2000, myAkant.getBalance());
    }

    @Test
    public void withdrawTest(){
        Akant myAkant = new Akant(1000);
        myAkant.deposit(2000);
        myAkant.withdraw(1000);
        assertEquals(2000, myAkant.getBalance());
    }
}
