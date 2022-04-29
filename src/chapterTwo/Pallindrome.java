package chapterTwo;
import java.util.Scanner;
public class Pallindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter your first number: ");
         int num1 = input.nextInt();
         System.out.println("Enter second number: ");
         int num2 = input.nextInt();
         System.out.println("Enter Third Number: ");
         int num3 = input.nextInt();

         if (num1 == num3) {
             System.out.println("Word is a palindromeS");
         }

         if (num1 != num3) {
             System.out.println("Number is not a pqllindrome");
         }

    }


}
