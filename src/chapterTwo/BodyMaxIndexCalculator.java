package chapterTwo;

import java.util.Scanner;

public class BodyMaxIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your weight in Pounds: ");
        int bodyWeight = input.nextInt();
        System.out.println("Enter Your Height in inches");
        int userHeight = input.nextInt();

        int bodyMaxIndex = bodyWeight * 703 / userHeight * userHeight;

        System.out.println("Enter Your weight in kilograms: ");
        int bodyWeightInKg = input.nextInt();
        System.out.println("Enter Your Height in meters: ");
        int bodyHeightInMeters = input.nextInt();

        int bodyMaxIndexInKg = bodyWeightInKg / bodyHeightInMeters * bodyHeightInMeters;

        System.out.println(bodyMaxIndex);
        System.out.println(bodyMaxIndexInKg);
    }
}
