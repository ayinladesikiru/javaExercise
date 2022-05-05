package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float mileage = 0;
        float totalMileage = 0;
        float gallonsUsed;
        float totalGallonUsed = 0;

        while (mileage != -1) {
            System.out.println("Enter mileage or -1 to quit: ");
            mileage = input.nextInt();
            totalMileage += mileage;

            System.out.println("Enter gallons used: ");
            gallonsUsed = input.nextInt();
            totalGallonUsed += gallonsUsed;
        }

        float gallonUsedPerMile = totalMileage / totalGallonUsed;
        System.out.printf("%n the total miles covered is %.2f", totalMileage);
        System.out.printf("%n the total gallons used is %.2f", totalGallonUsed);
        System.out.printf("%n Miles per gallon is %.2f", gallonUsedPerMile);


    }
    
}
