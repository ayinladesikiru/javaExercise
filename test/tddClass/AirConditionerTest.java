package tddClass;

import AirConditioner.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void testForPowerOff() {

        AirConditioner myAirconditioner = new AirConditioner();
        AirConditioner.acPowerOff(1);

        assertEquals("It is ON", myAirconditioner.checkPower());
    }

    @Test
    public void testForAcPowerOn() {
        // given
        AirConditioner myAirconditioner = new AirConditioner();
        // when
         AirConditioner.acPowerOn(0);
        // assert
        assertEquals("It is OFF", myAirconditioner.checkPower());
    }

    @Test
    public  void testForDecreaseTemperature() {
        AirConditioner myAirconditioner = new AirConditioner();
        AirConditioner.acTemperatureIncrease(1);
        assertEquals("Temperature Decreased", myAirconditioner.checkTemperature());
    }

    @Test
    public void testForIncreaseTemperature() {
        AirConditioner myAirconditioner = new AirConditioner();
        AirConditioner.acTemperatureDecrease( 0);
        assertEquals("Temperature Increased", myAirconditioner.checkTemperature());
    }

    @Test
    public void testTemperatureAbove30() {
        AirConditioner myAirconditioner = new AirConditioner();
        AirConditioner.temperatureAbove30(30);
        assertEquals("Temperature is still 30", myAirconditioner.checkTemperature());
    }

    @Test
    public void testForTemperatureBelow16() {
        AirConditioner myAirconditioner = new AirConditioner();
        AirConditioner.temperatureBelow16(16);
        assertEquals("Temperature is still 16", myAirconditioner.checkTemperature());
    }
}
