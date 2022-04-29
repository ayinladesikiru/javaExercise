package chapterTwo;

import java.util.Scanner;

public class TrippleDouble {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();

        int tripple = 3 * num1;
        int doubleMultiple = 2 * num2;

        if (tripple == doubleMultiple) {
            System.out.printf("The tripple of %d is %d and the double of %d is %d which means that the tripple of %d and the double of %d is equal", num1, tripple, num2, doubleMultiple, num1, num2);
        }

        if (tripple != doubleMultiple) {
            System.out.printf("The tripple of %d is not equal to the double of %d", num1, num2);
        }
    }

}
