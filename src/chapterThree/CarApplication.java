package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car myCar1 = new Car("camry","2011",5000.00);
        Car myCar2 = new Car("corollaSport", "2010", 10000.00);

        System.out.printf("%s price: $%.2f%n", myCar1.getModel(), myCar1.getPrice());
        System.out.printf("%s price: $%.2f%n", myCar2.getModel(), myCar2.getPrice());

        int discountPercent = 5;
        System.out.printf("giving 5 percent discount on %s%n", myCar1.getModel());
        myCar1.discount(discountPercent);
        System.out.printf("%s price after discount is $%.2f%n", myCar1.getModel(), myCar1.getPrice());

        int discountPercent2 = 7;
        System.out.printf("giving 7 percent discount on %s%n", myCar2.getModel());
        myCar2.discount(discountPercent2);
        System.out.printf("%s price after discount is $%.2f", myCar2.getModel(), myCar2.getPrice());

    }
}
