package chapterTwo;

import java.util.Scanner;

public class SquareCalc {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter First Number: ");
    int num1 = input.nextInt();
    
    System.out.println("Enter Second Number: ");
    int num2 = input.nextInt();
    
    double num1Square = num1 * num1;
    double num2Square = num2 * num2;
    double squareSum = num1Square + num2Square;
    double substractSquare = num1Square - num2Square;
    double addNum = num1 + num2;
    double substractNum = num1 - num2;
    
    
    
    System.out.printf("The Square of First Number is %f, The Square of Second Number is %f, The Sum of the Square of First number and Second Number is %f and The difference in the square of First Number and Second Number is %f", num1Square, num2Square, squareSum, substractSquare);
    
    }

}
