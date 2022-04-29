package chapterTwo;

import java.util.Scanner;

public class NegativeAndPositiveDetect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();

        System.out.println("Enter Third Number: ");
        int num3 = input.nextInt();

        System.out.println("Enter Fourth Number: ");
        int num4 = input.nextInt();

        System.out.println("Enter Fifth Number: ");
        int num5 = input.nextInt();

        if(num1 < 0){
            System.out.printf("%d is a negative integer %n", num1);
        }
        if (num2 < 0){
            System.out.printf("%d is a negative integer %n", num2);
        }
        if (num3 < 0){
            System.out.printf("%d is a negative integer %n", num3);
        }
        if (num4 < 0){
            System.out.printf("%d is a negative integer %n", num4);
        }
        else {
            System.out.printf("%d is a negative integer %n", num5);
        }
        if (num1 > 0){
            System.out.printf("%d is a positive integer %n", num1);
        }
        if (num2 > 0){
            System.out.printf("%d is a positive integer %n", num2);
        }
        if (num3 > 0){
            System.out.printf("%d is a positive integer %n", num3);
        }
        if (num4 > 0){
            System.out.printf("%d is a positive integer %n", num4);
        }
        if (num5 > 0) {
            System.out.printf("%d is a positive integer %n", num5);
        }
        if(num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0){
            System.out.print("The Number is zero integer");
        }
    }

}
