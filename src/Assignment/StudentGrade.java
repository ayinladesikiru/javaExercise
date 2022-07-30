package chapterSix;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of student: ");
        int noOfStudents = input.nextInt();

        System.out.println("Enter number of subjects: ");
        int noOfSubjects = input.nextInt();

        int[][] studentArray = new int[noOfStudents][noOfSubjects];

        for (int i = 0; i < studentArray.length; i++) {
            for (int j = 0; j < studentArray.length; j++) {
                System.out.println("Enter students Scores: ");
               studentArray[i][j] = input.nextInt();
            }
        }
            for (int k = 0; k < studentArray.length; k++){
                for (int l = 0; l < studentArray.length; l++){
                    System.out.print(Arrays.toString(new int[] {studentArray[k][l]}));
                }
                System.out.println();
            }
    }

}