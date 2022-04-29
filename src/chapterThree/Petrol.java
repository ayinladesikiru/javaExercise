package chapterThree;

public class Petrol {

    public static void main (String[] args) {
        PetrolPurchase customer1 = new  PetrolPurchase("lagos", "petrol", 200, 50.5, 100.50);
        PetrolPurchase customer2 = new PetrolPurchase("Kano", "Diesel", 300, 220.2,65.50);

        System.out.printf("The Average Petrol Purchase is: %.2f%n", customer1.getPurchaseAmount());
        System.out.printf("The Average Diesel Purchase is: %.2f", customer2.getPurchaseAmount());
    }

}
