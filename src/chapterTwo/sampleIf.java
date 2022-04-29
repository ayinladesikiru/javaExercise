package chapterTwo;

import java.util.Scanner;

public class sampleIf {

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter value: ");       
        int num = input.nextInt();
        
        if (num != 7) {
        
        System.out.println("The variable number is not equal to 7");
        }
    
    }

}
