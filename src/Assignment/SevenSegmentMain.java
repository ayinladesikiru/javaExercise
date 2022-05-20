package Assignment;

import java.util.Scanner;

import static Assignment.SevenSegment.*;

public class SevenSegmentMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to display: ");
        String userInput = input.nextLine();

        displaySegment(userInput);
        showSegment();

    }
}
