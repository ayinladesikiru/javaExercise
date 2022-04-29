package chapterSix;

import java.security.SecureRandom;

public class GameOfCraps {

        public String gameState;
        int sumOfDicePlayed;
        private static final SecureRandom randomDice = new SecureRandom();
        private enum GameStatus{YOU_WON, YOU_LOST, CONTINUE_PLAYING};

        public static int diceRoll () {
            int dice1 = randomDice.nextInt(1, 7);
            int dice2 = randomDice.nextInt(1, 7);
            int sumOfDicePlayed = dice1 + dice2;
            System.out.printf("you rolled %d + %d = %d%n", dice1, dice2, sumOfDicePlayed);
            return sumOfDicePlayed;
        }


        public String gameStatus () {
            return gameState;
        }

        public int getSumOfDiceRolled () {
            return sumOfDicePlayed;
        }



    }

