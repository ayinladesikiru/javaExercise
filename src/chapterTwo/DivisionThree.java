package chapterTwo;

import java.util.Scanner;

public class DivisionThree {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number");
    double num1 = input.nextInt();
    
    double divideByThree = num1 % 3;
    
    if(divideByThree == 0) {
        System.out.println("Divisible of 3");
    }
    
    else{
        System.out.println("Not Divisible of 3");
    } 
    
    
    }

}
