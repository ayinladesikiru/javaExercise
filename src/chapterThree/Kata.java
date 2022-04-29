package chapterThree;

public class Kata {

    public int result;

    public void quotientDivision(int i, int j) {
        result = i / j;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }


    public int largestNum(int num1, int num2, int num3, int num4, int num5) {
        int result;
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            result = num1;
        }
        if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            result = num2;
        }
        if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            result = num3;
        }
        if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            result = num4;
        } else result = num5;

        return result;
    }

    public int numberFactorsCheck(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
               counter += 1;
            }
        }
        return counter;
    }



         public boolean primeNumberCheck (int num){
             return numberFactorsCheck(num) <= 2;
         }

}