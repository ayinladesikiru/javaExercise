package tddClass;

import chapterSix.GameOfCraps;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GameOfCrapsTest {

    @Test
    public void testForGameOfCraps(){
        GameOfCraps myGameOfCraps = new GameOfCraps();
        myGameOfCraps.diceRoll();
        assertNotEquals(0, myGameOfCraps.getSumOfDiceRolled());
    }

    @Test
    public void testForGameWon(){
        GameOfCraps myGameOfCraps = new GameOfCraps();
        myGameOfCraps.diceRoll();
        myGameOfCraps.gameStatus();
       assertEquals("Game Won", myGameOfCraps.gameStatus());
    }

}
