package chapterTwo;

import java.util.Scanner;

public class RunwayLength {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Speed: ");
    int speedNum = input.nextInt();
    
    System.out.println("Enter acceleration: ");
    float accelerationRate = input.nextFloat();
    
    float runwayLength = (speedNum * speedNum) / (2 * accelerationRate);
    
    System.out.printf("The minimum run way length for this airplane is %f", runwayLength);
    
    }

}
