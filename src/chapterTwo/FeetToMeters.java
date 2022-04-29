package chapterTwo;

import java.util.Scanner;

public class FeetToMeters {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("ENter a value for feet: ");
    float feetValue = input.nextFloat();
    
    double valuesInMeeters = feetValue * 0.305;
    
    System.out.printf("%f feet is %f meters", feetValue, valuesInMeeters);
    
    } 

}
