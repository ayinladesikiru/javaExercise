package tddClass;

import java.util.Random;
import java.util.Scanner;

public class QuizGenerator {

    public void randomQuestion() {

        Random quiz = new Random();
        Scanner input = new Scanner(System.in);

        int firstRandomNumber = 1 + quiz.nextInt();
        int secondRandomNumber = 1 + quiz.nextInt();
        int randomOperator = 1 + quiz.nextInt();
        int userAnswer = 0;
        int systemAnswer = 0;

        switch (randomOperator) {
            case 1:
                System.out.printf("%d + %d = ", firstRandomNumber, secondRandomNumber);
                int answer = input.nextInt();
                int myAns = firstRandomNumber + secondRandomNumber;
                if (myAns == answer){
                    userAnswer++;
                } else systemAnswer++;

            case 2:
                System.out.printf("%d - %d = ", firstRandomNumber, secondRandomNumber);

        }






    }
}
