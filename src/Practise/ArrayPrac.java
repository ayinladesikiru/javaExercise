package Practise;

import java.security.SecureRandom;

public class ArrayPrac {
    public static void main(String[] args) {

        // creating an array

        String b [] = new String[100];

        // doable but not advised
        String[] x = new String[20], y = new String[50];

        // printing the default values of int c array.

        int[] c = new int[10];

        System.out.printf("%s%8s%n", "index", "value");

        for (int counter = 0; counter < c.length; counter++){
            System.out.printf("%5d%8d%n", counter, c[counter]);
        }


        // using an array initializer and printing out the elements
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.printf("%s%8s%n", "index", "value");
        for (int count = 0; count < a.length; count++){
            System.out.printf("%s%8s%n", count, a[count]);
        }

        // populating an array with integers

        final int ARRAY_LENGTH = 10;
        int[] arrayLengthDeclaredWithVariable = new int[ARRAY_LENGTH];
        for (int counts = 0; counts < arrayLengthDeclaredWithVariable.length; counts++){
            arrayLengthDeclaredWithVariable[counts] = 2 + 2 * counts;
        }

        System.out.printf("%s%8s%n", "index", "value");
        for (int counts = 0; counts < arrayLengthDeclaredWithVariable.length; counts++){
            System.out.printf("%d%8d%n", counts, arrayLengthDeclaredWithVariable[counts]);
        }

        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];

        for (int roll = 1; roll <= 60_000_000; roll++){
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        System.out.printf("%s%8s%n", "index", "value");
        for (int face = 1; face < frequency.length; face++){
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }

        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequenzy = new int[6];
        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequenzy[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // invokes toString method
                System.out.printf("responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");
        for (int rating = 1; rating < frequenzy.length; rating++){
            System.out.printf("%6d%10d%n", rating, frequenzy[rating]);
        }
    }
}
