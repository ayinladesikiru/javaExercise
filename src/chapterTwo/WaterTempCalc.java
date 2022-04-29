package chapterTwo;

import java.util.Scanner;

public class WaterTempCalc{

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);    
    
    System.out.println("Enter the amount of water in kilograms: ");
    float mass = input.nextFloat();
    
    System.out.println("Enter the initial temperature: ");
    float temp1 = input.nextFloat();
    
    System.out.println("Enter the final temperature: ");
    float temp2 = input.nextFloat();
    
    float quantityOfEnergy = mass * (temp1 - temp2) * 4184;
    
    System.out.printf("The Energy needed is %f", quantityOfEnergy);
    
    
    }

}
