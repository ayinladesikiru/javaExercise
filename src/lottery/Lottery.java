package lottery;

import java.security.SecureRandom;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {


        int guessNum;

        SecureRandom lottery = new SecureRandom();

        Scanner playerNum = new Scanner(System.in);
        System.out.println("Enter Your Lucky Number: ");
        guessNum = playerNum.nextInt();

        int lotteryNum = lottery.nextInt(100);
        int lotteryNum1 = lotteryNum / 10;
        int lotteryNum2 = lotteryNum % 10;
        int guessNum1 = guessNum / 10;
        int guessNum2 = guessNum % 10;

        if (lotteryNum == guessNum) {
            System.out.println("You're a star, you won $10,000");
        } else if (guessNum1 == lotteryNum2 || lotteryNum2 == guessNum1) {
            System.out.println("You rock, You won $2,000");
        } else {
            System.out.printf("%s%d%n", "The lucky number is ", lotteryNum);
            System.out.println("Try again!!!");
        }


    }

}