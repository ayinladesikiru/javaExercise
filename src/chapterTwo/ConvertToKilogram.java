package chapterTwo;

import java.util.Scanner;

public class ConvertToKilogram {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number in pounds: ");
    float pounds = input.nextFloat();
    
    double toKilogram = pounds * 0.454;
    
    System.out.printf("%f pounds is %f kilograms", pounds, toKilogram);   
    
    }

}
