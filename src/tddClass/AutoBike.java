package tddClass;

public class AutoBike {

    private boolean isOn;
    private int speed;

    public void bikeOn() {
        isOn = true;
    }

    public void acceleration() {

        if (speed <= 20) { speed += 1; }

        if (speed >= 21 && speed <= 30) { speed += 2; }

        if (speed >= 31 && speed <= 40) { speed += 3; }

        if (speed >= 41) { speed += 4; }

    }

        public boolean powerOn () {
            return isOn;
        }

        public int getSpeed () {
            return speed;
        }
    }

