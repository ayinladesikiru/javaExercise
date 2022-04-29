package chapterTwo;

import java.util.Scanner;

public class ThreeIntCompare {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter First number: ");
    double num1 = input.nextInt();
    
    System.out.println("Enter Second Number: ");
    double num2 = input.nextInt();
    
    System.out.println("Enter Third Number: ");
    double num3 = input.nextInt();
    
    double sum = num1 + num2 + num3;
    double average = (num1 + num2 + num3) / 3;
    double product = num1 * num2 * num3;
    
    double largest = num1;
    double smallest = num1;
    
    System.out.printf("The sum of %.0f, %.0f and %.0f is %.0f %n", num1, num2, num3, sum);
    System.out.printf("The average of %.0f, %.0f and %.0f is %.0f %n", num1, num2, num3, average);
    System.out.printf("The Product of %.0f, %.0f and %.0f is %.0f %n", num1, num2, num3, product);
    
    if (num2 > largest) {
        largest = num2;
    } if (num3 > num2) {
       largest = num3;
    } if (num2 < smallest) {
        smallest = num2;
    } if (num3 < num2) {
        smallest = num3;
    }
    
    System.out.printf("The largest number is %.0f and The Smallest is %.0f %n", largest, smallest);
    
    
    }

}
