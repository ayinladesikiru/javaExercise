package chapterTwo;

import java.util.Scanner;
public class TextPro {
public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int num1 = input.nextInt();

    System.out.println("Enter Second number: ");
    int num2 = input.nextInt();

    System.out.println("Enter Third number: ");
    int num3 = input.nextInt();
    
    int largest = num1;
    int smallest = num1;

    if (num2 > largest) {
    System.out.println(num2);
}

    if (num3 > largest) {
    System.out.println(num3);
}

}
}
