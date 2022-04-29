package chapterSix;

public class GameOfCrapsMain {

    private enum Status {YOU_WIN, YOU_LOST, CONTINUE_PLAYING}

    public static void main(String[] args) {
        Status gameStatus;
        int myPoints = 0;
        int myCraps = GameOfCraps.diceRoll();

        if (myCraps == 7 || myCraps == 11) {
            gameStatus = Status.YOU_WIN;
            System.out.println(gameStatus);
        } else if (myCraps == 2 || myCraps == 3 || myCraps == 12){
            gameStatus = Status.YOU_LOST;
            System.out.println(gameStatus);
        } else
            gameStatus = Status.CONTINUE_PLAYING;
            myPoints = myCraps;
        System.out.println(gameStatus);

    }
}
