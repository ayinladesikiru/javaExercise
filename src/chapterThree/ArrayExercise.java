package chapterThree;

import java.sql.SQLOutput;

public class ArrayExercise<i> {
    public static void main(String[] args) {
        String[][] letters = new String[3][3];
        letters[0][0] = "X";
        letters[0][1] = "O";
        letters[0][2] = "X";
        letters[1][0] = "X";
        letters[1][1] = "X";
        letters[1][2] = "X";
        letters[2][0] = "O";
        letters[2][1] = "X";
        letters[2][2] = "O";
        System.out.println(letters[0][0] + " " + letters[0][1] + " " + letters[0][2]);
        System.out.println(letters[1][0] + " " + letters[1][1] + " " + letters[1][2]);
        System.out.println(letters[2][0] + " " + letters[2][1] + " " + letters[2][2]);
    }

}