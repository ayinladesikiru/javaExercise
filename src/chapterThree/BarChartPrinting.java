package chapterThree;

import java.util.Scanner;

public class BarChartPrinting {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number");
        int num2 = input.nextInt();
        System.out.println("Enter Third Number");
        int num3 = input.nextInt();
        System.out.println("Enter Fourth Number");
        int num4 = input.nextInt();
        System.out.println("Enter Fifth Number");
        int num5 = input.nextInt();

        for (int i = 1; i <= num1; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 1; i <= num2; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 1; i <= num3; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 1; i <= num4; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 1; i <= num5; i++){
            System.out.print("*");
        } System.out.println();

    }
}
