package Tv;

public class Tv {

    private int channel;
    private int volume;

    public boolean powerOn() {
        return true;
    }

    public boolean powerOff() {
        return false;
    }

    public void channelIncrease() {
        channel += 1;
    }

    public void channelDecrease() {
        channel -= 1;
    }

    public void volumeIncrease() {
        volume += 1;
    }

    public void volumeDecrease() {
        volume -= 1;
    }

    public void avChannel() {
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}
