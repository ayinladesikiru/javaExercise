package Assignment;

import java.util.Scanner;

public class MyersBriggs {

    static int questionNumber = 1;

    public static void main(String[] args) {

        String[] extroversionVsIntroversionTest = {
                "A. expend energy, enjoy groups. B. conserve energy, enjoy one-on-one",
                "A. more outgoing, think out loud. B. more reserved, think to yourself",
                "A. seek many tasks, public activities, interaction with others. " +
                        "B. seek private, solitary activities with quiet to concentrate,",
                "A.external, communicative, express yourself. B. internal, reticent, keep to yourself",
                "A. active, initiate. B. reflective, deliberate"};

        String[] sensingVsIntuitionTest = {
                "A. interpret literally. B. look for meaning and possibilities",
                "A. practical, realistic, experiential. B. imaginative, innovative, theoretical",
                "A. standard, usual, conventional. B. different, novel, unique",
                "A. focus on here-and-now\" .B.look to the future, global perspective, \"big picture\"",
                "A. facts, things, \"what is\". B. ideas, dreams, \"what could be,\" philosophical"};

        String[] thinkingVsFeelingTest = {
                "A. logical, thinking, questioning. B. empathetic, feeling, accommodating",
                "B. candid, straight forward, frank. B.tactful, kind, encouraging",
                "A. firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate",
                "A. tough-minded, just B.tender-hearted, merciful",
                "A. matter of fact, issue-oriented B. sensitive, people-oriented, compassionate",
        };

        String[] judgingVsPerceivingTest = {
                "A. organized, orderly. B. flexible, adaptable",
                "A. plan, schedule B. unplanned, spontaneous",
                "A. regulated, structured B. easygoing, \"live\" and \"let live\"",
                "A. preparation, plan ahead. B. go with the flow, adapt as you go",
                "A. control, govern B. latitude, freedom"};

        int[] extrovertVsIntrovertAnswers = new int[5];
        int[] sensingVsIntuitionsAnswers = new int[5];
        int[] thinkingVsFeelingAnswers = new int[5];
        int[] judgingVsPerceivingAnswers = new int[5];

        StringBuilder result = new StringBuilder();


        iterate(extroversionVsIntroversionTest, extrovertVsIntrovertAnswers);
        iterate(sensingVsIntuitionTest, sensingVsIntuitionsAnswers);
        iterate(thinkingVsFeelingTest, thinkingVsFeelingAnswers);
        iterate(judgingVsPerceivingTest, judgingVsPerceivingAnswers);

        int sumOfAsInExtroversion = sum(extrovertVsIntrovertAnswers);
        int sumOfAInSensing = sum(sensingVsIntuitionsAnswers);
        int sumOfAsInThinking = sum(thinkingVsFeelingAnswers);
        int sumOfAsInJudging = sum(judgingVsPerceivingAnswers);


        if (sumOfAsInExtroversion < 3) {
            result.append("I");
        } else result.append("E");

        if (sumOfAInSensing < 3) {
            result.append("N");
        } else result.append("S");

        if (sumOfAsInJudging < 3) {
            result.append("P");
        } else result.append("J");

        if (sumOfAsInThinking < 3) {
            result.append("F");
        } else result.append("T");


        System.out.print("\n Your Response in a Table\n");

        System.out.printf("%s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "A", "B", " ", "A", "B", " ", "A", "B", " ", "A", "B");

        int questionNumberInitializer = 1;

        System.out.printf("%s%n", "-".repeat(74));

        for (int i = 0; i < extrovertVsIntrovertAnswers.length; i++) {
            System.out.printf("|%5d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s |%n", questionNumberInitializer++,
                    placeCheckmark(extrovertVsIntrovertAnswers[i], 1),
                    placeCheckmark(extrovertVsIntrovertAnswers[1], 2), questionNumberInitializer++,
                    placeCheckmark(sensingVsIntuitionsAnswers[i], 1),
                    placeCheckmark(sensingVsIntuitionsAnswers[i], 2), questionNumberInitializer++,
                    placeCheckmark(thinkingVsFeelingAnswers[i], 1),
                    placeCheckmark(thinkingVsFeelingAnswers[i], 2), questionNumberInitializer++,
                    placeCheckmark(judgingVsPerceivingAnswers[i], 1),
                    placeCheckmark(judgingVsPerceivingAnswers[i], 2));
        }

        System.out.printf("%s%n", "-".repeat(74));

        System.out.printf("|%5s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d |%n", "TOTAL",
                countNum(extrovertVsIntrovertAnswers, 1), countNum(extrovertVsIntrovertAnswers, 0), " ",
                countNum(sensingVsIntuitionsAnswers, 1), countNum(sensingVsIntuitionsAnswers, 0), " ",
                countNum(thinkingVsFeelingAnswers, 1), countNum(thinkingVsFeelingAnswers, 0), " ",
                countNum(judgingVsPerceivingAnswers, 1), countNum(judgingVsPerceivingAnswers, 0));
    }

    private static int countNum(int[] numArray, int number) {
        int count = 0;
        for (int num : numArray) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }

    private static String placeCheckmark(int position, int num) {
        return (num == 1 && position == 1) || (num == 0 && position == 2) ? String.format("%c", '\u2713') : "";
    }

    private static int sum(int[] testAnswers) {
        int sum = 0;
        for (int number : testAnswers) sum += number;
        return sum;
    }

    private static void iterate(String[] testQuestions, int[] testAnswers) {
        Scanner input = new Scanner(System.in);
        String optionAorB;

        for (int number = 0; number < testQuestions.length; number++) {
            System.out.printf("Questions %d%n", questionNumber++);
            System.out.println(testQuestions[number]);
            System.out.println("Pick an option A or B");
            optionAorB = getOption(input);
            if (optionAorB.equalsIgnoreCase("A")) {
                testAnswers[number] = 1;
            }
        }
    }

    public static String getOption(Scanner input){
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