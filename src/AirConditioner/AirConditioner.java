package AirConditioner;

public class AirConditioner {

    private static String acMode;
    private static String temperature;


    public static void acPowerOff(int powerButton) {
        if (powerButton == 1)
            acMode = "It is ON";
    }

    public static void acPowerOn(int powerButton) {
        if (powerButton == 0)
            acMode = "It is OFF";
    }

    public static void acTemperatureDecrease(int temperatureButton) {
        if (temperatureButton == 0)
            temperature = "Temperature Increased";
    }

    public static void acTemperatureIncrease(int temperatureButton) {
        if (temperatureButton == 1)
            temperature = "Temperature Decreased";
    }

    public static void temperatureAbove30(int temperatureButton) {
        if (temperatureButton >= 30)
            temperature = "Temperature is still 30";
    }

    public static void temperatureBelow16(int temperatureButton) {
        if (temperatureButton <= 16)
            temperature = "Temperature is still 16";
    }

    public String checkPower() {
        return acMode;
    }

    public String checkTemperature(){
        return temperature;
    }


}
