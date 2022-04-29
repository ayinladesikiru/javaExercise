package chapterTwo;// this is a program for simple calculation

import java.util.Scanner;

public class DemoOne {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter an integer: ");
    
    int b = 10;
    int c = 20;
    int a = b * c ;
    
    System.out.printf("The Product of %d and %d is %d%n", b, c, a);
    
    }
}
