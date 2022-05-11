package chapterThree;

public class Car {

    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setYear(){
        this.year = year;
    }

    public String getYear(){
        return year;
    }

    public void discount(int discountPercent){
        double discount = price * discountPercent / 100;
        price -= discount;
    }

    public void setPrice(){
        if (price > 0) {
        }
    }

    public double getPrice(){
        return price;
    }
}
