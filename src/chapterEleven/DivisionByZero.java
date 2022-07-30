package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {

    public static void main(String[] args) {
        int numerator = input("Enter numerator: ");
        int denomerator = input("Enter denominator: ");
        int approximationQuotient = numerator / denomerator;
        display(approximationQuotient+"");
    }
        private static int input(String prompt){
            display("Enter numerator: ");
            Scanner keyboardInput = new Scanner(System.in);
            try {
                return keyboardInput.nextInt();
            }
            catch(InputMismatchException ex){
                display("i dey expect only integers\n");
                display("Try again\n");
                input(prompt);
            }
        return 0;
    }
        private static void display(String prompt){
            System.out.printf(prompt);
        }

    }

