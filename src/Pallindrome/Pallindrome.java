package Pallindrome;

public class Pallindrome {

    private boolean result;

    int number;

    public boolean testpallindrome() {

        int num1 = number / 10000;
        int num2 = (number / 1000) % 10;
        int num3 = (number / 100)  % 10;
        int num4 = (number / 10) % 10;
        int num5 = number % 10;

        if (num1 == num5 || num2 == num4) {
            return result = true;
        }
         return result;
    }
}
