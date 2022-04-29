package tddClass;

import Tv.Tv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TvTest {

    @Test
    public void testForPowerOn(){
        Tv myTv = new Tv();
        myTv.powerOn();
        assertTrue(myTv.powerOn());
    }

    @Test
    public void testForpowerOff(){
        Tv myTv = new Tv();
        myTv.powerOff();
        assertFalse(myTv.powerOff());
    }

    @Test
    public void testForChannelChange() {
        Tv myTv = new Tv();
        myTv.channelIncrease();
        myTv.channelIncrease();
        myTv.channelIncrease();
        assertEquals(3, myTv.getChannel());
    }

    @Test
    public void testForChannelDecrease(){
        Tv myTv = new Tv();
        myTv.channelIncrease();
        myTv.channelIncrease();
        myTv.channelIncrease();
        myTv.channelIncrease();
        myTv.channelIncrease();
        myTv.channelDecrease();
        assertEquals(4, myTv.getChannel());
    }

    @Test
    public void testForVolumeIncrease(){
        Tv myTv = new Tv();
        myTv.volumeIncrease();
        myTv.volumeIncrease();
        myTv.volumeIncrease();
        myTv.volumeIncrease();
        myTv.volumeIncrease();
        assertEquals(5, myTv.getVolume());
    }

    @Test void testForVolumeDecrease(){
        Tv myTv = new Tv();
        myTv.volumeIncrease();
        myTv.volumeIncrease();
        myTv.volumeIncrease();
        myTv.volumeIncrease();
        myTv.volumeIncrease();
        myTv.volumeDecrease();
        myTv.volumeDecrease();
        assertEquals(3, myTv.getVolume());
    }


}
