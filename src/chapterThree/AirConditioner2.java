package chapterThree;

public class AirConditioner2 {
    private boolean isOn;  //instance variable
    private int temperature;  //instance variable
    private String productName;

    public AirConditioner2(String productName, int temperature){
        this.productName = productName;
        this.temperature = temperature;

    }

    public void setTemperature(int newTemperature){
        temperature = newTemperature;
    }
    public int getTemperature(){
        return temperature;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void setOn(boolean isOn){
        this.isOn = isOn;
    }

    public boolean getOn(){
        return isOn;
    }


}