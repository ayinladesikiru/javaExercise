package Assignment;

import java.util.Scanner;
public class MyersBriggs {
    static int questionNumber = 1;

    static int countNum(int[] numArray, int number) {
        int count = 0;
        for (int num : numArray) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }

    static String addCheckmark(int position, int num) {
        return (num == 1 && position == 1) || (num == 0 && position == 2) ? String.format("%c", '\u2713') : "";
    }

    static int sumOfTestResponse(int[] testAnswers) {
        int total = 0;
        for (int number : testAnswers) total += number;
        return total;
    }

    static void iterateTestQuestions(String[] testQuestions, int[] testAnswers) {
        Scanner input = new Scanner(System.in);
        String optionAorB;

        for (int number = 0; number < testQuestions.length; number++) {
            System.out.printf("Questions %d%n", questionNumber++);
            System.out.println(testQuestions[number]);
            System.out.println("Pick an option A or B");
            optionAorB = getTestOptions(input);
            if (optionAorB.equalsIgnoreCase("A")) {
                testAnswers[number] = 1;
            }
        }
    }

    public static String getTestOptions(Scanner input){
        String option;
        while (true){
            try {
                option = input.nextLine();
                if(option.trim().equalsIgnoreCase("A".trim()) || option.trim().equalsIgnoreCase("B".trim())){
                    return option;
                }else {
                    throw new IllegalArgumentException("Wrong choice; choose A or B");
                }
            }catch (IllegalArgumentException ex){
                System.err.println(ex.getMessage());
            }
        }
    }


}
