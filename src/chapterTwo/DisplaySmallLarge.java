package chapterTwo;

import java.util.Scanner;

public class DisplaySmallLarge {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Number 1: ");
    int num1 = input.nextInt();
    
    System.out.println("Enter Number 2: ");
    int num2 = input.nextInt();
    
    System.out.println("Enter Number 3: ");
    int num3 = input.nextInt();
    
    System.out.println("Enter Number 4: ");
    int num4 = input.nextInt();
    
    System.out.println("Enter Number 5: ");
    int num5 = input.nextInt();
    
    int largest = num1;
    int smallest = num1;
    
    if (num2 > largest) {
        largest = num2;
    } if (num3 > largest) {
        largest = num3;
    } if (largest > num4) {
        largest = num4;
    } if (largest > num5) {
        largest = num5;
    } if (smallest < num2) {
        smallest = num2;
    } if (smallest < num3) {
        smallest = num3;
    } if (smallest < num4) {
        smallest = num4;
    } if (smallest < num5) {
        smallest = num5;
    }
    
    System.out.printf("The Largest number is %.0f and The Smallest number is %.0f", largest, smallest);
    
    }

}
