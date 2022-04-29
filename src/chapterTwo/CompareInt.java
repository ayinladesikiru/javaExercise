package chapterTwo;

import java.util.Scanner;

public class CompareInt {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Number: ");
    double num = input.nextDouble();
    
    double squareNum = num * num;
    double compareNum = 100;
    
    if(squareNum > compareNum) {
        System.out.printf("The square of %f is %f and is greater than %f", num, squareNum, compareNum);
    } else if (squareNum == compareNum) {
        System.out.printf("The squate of %f is %f and is equal to %f", num, squareNum, compareNum);
    } else if (squareNum < compareNum) {
        System.out.printf("The square of %f is %f and is less than %f", num, squareNum, compareNum);
    }  else {
        System.out.printf("The square of %f is %f and is not equal to %f", num, squareNum, compareNum);
    }
    
    }

}
