package tddClass;

// import Pallindrome.Pallindrome;
// import jdk.incubator.vector.VectorOperators;
import chapterThree.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {

//    @Test
//    public void testForPallindrome() {
//        Pallindrome testPallindrome = new Pallindrome();
//
//        assertTrue(true);
//    }
//
    @Test
    public void testForOneToFourOrder(){
        TestDriller customerOrder = new TestDriller();
        customerOrder.customerQuantityOrder(3);
        assertEquals(6000, customerOrder.result);
    }

    @Test
    public void testForFiveToNine() {
        TestDriller customerOrder = new TestDriller();
        customerOrder.customerQuantityOrder(7);
        assertEquals(12600, customerOrder.result);
    }

    @Test
    public void testForTenToTwentyNine() {
        TestDriller customerOrder = new TestDriller();
        customerOrder.customerQuantityOrder(15);
        assertEquals(24000, customerOrder.result);
    }

    @Test
    public void testForThirtyToFortyNine() {
        TestDriller customerOrder = new TestDriller();
        customerOrder.customerQuantityOrder(35);
        assertEquals(52500, customerOrder.result);
    }

    @Test
    public void testForFiftyToNinetyNine() {
        TestDriller customerOrder = new TestDriller();
        customerOrder.customerQuantityOrder(55);
        assertEquals(71500, customerOrder.result);
        }

        @Test
    public void testFor100And199(){
        TestDriller customerOrder = new TestDriller();
        customerOrder.customerQuantityOrder(150);
        assertEquals(180000, customerOrder.result);
        }

        @Test
    public void testFor200And499() {
        TestDriller customerOrder = new TestDriller();
        customerOrder.customerQuantityOrder(300);
        assertEquals(330000, customerOrder.result);
        }

        @Test
    public void testFor500Above() {
        TestDriller customerOrder = new TestDriller();
        customerOrder.customerQuantityOrder(700);
        assertEquals(700000, customerOrder.result);
        }

    @Test
    public void testForDivision() {
        Kata quotentKata = new Kata();
        quotentKata.quotientDivision(8,2);
        assertEquals(4, quotentKata.result);

    }

    @Test
    public void testForOdd() {
        int num = 0;
        while (num < 100) {
            num += 2;
            System.out.print(num + " ");
        }
    }

    @Test
    public void testForEvenNumber(){
        Kata evenTest = new Kata();
        boolean result = evenTest.isEven(6);
        assertTrue(result);
    }

    @Test
    public void testForOddNumber(){
        Kata oddTest = new Kata();
        boolean result = oddTest.isEven(3);
        assertFalse(result);
    }


    @Test
    public void testForBiggestNumber(){
        Kata biggestNumber = new Kata();
        int result = biggestNumber.largestNum(2,3,6,9,10);
        assertEquals(10, result);
    }

    @Test
    public void testForNumberFactors(){
        Kata numFactors = new Kata();
        int result = numFactors.numberFactorsCheck(49);
        assertEquals(3,result);
    }

    @Test
    public void testForPrimeNumber(){
        Kata primeNum = new Kata();
        primeNum.primeNumberCheck(29);

    }

}


