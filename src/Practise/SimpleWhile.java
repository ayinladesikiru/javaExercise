package Practise;

// chapter 5 exercises

import java.util.Scanner;

public class SimpleWhile {
    public static void main(String[] args) {
        
        int count = 0;
        int total = 0;
        while (count < 100){
            total += count;
            count++;
        }
        System.out.println(total);
        int sum = 0;
        for (int i = 0; i < 100; i++){
            sum += i;
        }
        System.out.println(sum);

        double result = 0;
        result = Math.pow(2.5, 3);
        System.out.println(result);

        int j = 0;
        while (j < 20){
            System.out.printf("%d%n", j);
            ++j;
        }

        int x = 0;
        while (x <= 20){
            System.out.printf("%d  ", x);
            if (x % 5 == 0){
                System.out.println();
            }
            ++x;
        }

//        basic switch case
        System.out.println("Enter 1 0r 2: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        switch (n) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            default:
                System.out.println("The number is not 1 or 2");
        }

        // loop for num from 19 to 1 to output even numbers alone

        for (int q = 19; q >= 1; q -= 2 ){
            System.out.println(q);
        }

        int t = 0;

        do {
            System.out.println(t);
            t += 2;
        } while (t <= 50);

        for (int i = 1; i < 3; i++) {
            for (int p = 1; p < 5; p++)
                System.out.print('*');
            System.out.println("\n#####");
        }
    }

    }

