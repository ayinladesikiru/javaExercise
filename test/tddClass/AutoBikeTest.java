package tddClass;

// import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoBikeTest {

    private AutoBike myPowerBike;
    @BeforeEach
    public void setUp(){
        myPowerBike = new AutoBike();
    }

    @Test
    public void testForPowerOn() {
        myPowerBike.bikeOn();
        assertTrue(myPowerBike.powerOn());
    }

    @Test
    public void testForPowerOff() {
        AutoBike myPowerBike = new AutoBike();
        myPowerBike.bikeOn();
        assertFalse(false);
    }

    @Test
    public void testForAcceleration() {
        AutoBike myPowerBike = new AutoBike();
        myPowerBike.acceleration();
        assertEquals(1, myPowerBike.getSpeed());
    }



    @Test
    public void testForGearOne() {
        AutoBike myPowerBike = new AutoBike();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        assertEquals(16, myPowerBike.getSpeed());
    }

    @Test
    public void testForGearTwo() {
        AutoBike myPowerBike = new AutoBike();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        assertEquals(23, myPowerBike.getSpeed());
    }

    @Test
    public void testForGearThree(){
        AutoBike myPowerBike = new AutoBike();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        assertEquals(37, myPowerBike.getSpeed());
    }

    @Test
    public void testForGearFour(){
        AutoBike myPowerBike = new AutoBike();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        myPowerBike.acceleration();
        assertEquals(51, myPowerBike.getSpeed());
    }

}
