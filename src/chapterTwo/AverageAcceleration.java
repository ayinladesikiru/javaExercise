package chapterTwo;

import java.util.Scanner;

public class AverageAcceleration {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter V0: ");
    float velocity1 = input.nextFloat();
    
    System.out.println("Enter V1: ");
    float velocity2 = input.nextFloat();
    
    System.out.println("Enter Time: ");
    float timeTaken = input.nextFloat();
    
    float accelerationTaken = (velocity1 - velocity2) / timeTaken;
    
    System.out.printf("The average acceleration is %f", accelerationTaken);    
    
    }

}
