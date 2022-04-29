package chapterTwo;

import java.util.Scanner;

public class NumberOfYears {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of minutes: ");
    double minutes = input.nextDouble();
    
    double noOfYears = minutes / 365;
    
    double noOfDays = minutes % 365;
    
    System.out.printf("%f minutes is approximately %f years and %f days", minutes, noOfYears, noOfDays);
    
    }

}
