package Assignment;



import static Assignment.MyersBriggs.*;

public class MyersBriggsMain {

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


        iterateTestQuestions(extroversionVsIntroversionTest, extrovertVsIntrovertAnswers);
        iterateTestQuestions(sensingVsIntuitionTest, sensingVsIntuitionsAnswers);
        iterateTestQuestions(thinkingVsFeelingTest, thinkingVsFeelingAnswers);
        iterateTestQuestions(judgingVsPerceivingTest, judgingVsPerceivingAnswers);

        int sumOfAsInExtroversion = sumOfTestResponse(extrovertVsIntrovertAnswers);
        int sumOfAInSensing = sumOfTestResponse(sensingVsIntuitionsAnswers);
        int sumOfAsInThinking = sumOfTestResponse(thinkingVsFeelingAnswers);
        int sumOfAsInJudging = sumOfTestResponse(judgingVsPerceivingAnswers);

        if (sumOfAsInExtroversion > 3) {
            result.append("I");
        } else result.append("E");

        if (sumOfAInSensing > 3) {
            result.append("N");
        } else result.append("S");

        if (sumOfAsInJudging > 3) {
            result.append("P");
        } else result.append("J");

        if (sumOfAsInThinking > 3) {
            result.append("F");
        } else result.append("T");

        System.out.print("\n Your Meyers Briggs Test Result in a Table\n");

        System.out.printf("%s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "A", "B", " ", "A", "B", " ", "A", "B", " ", "A", "B");

        int questionNumberInitializer = 1;

        System.out.printf("%s%n", "-".repeat(74));

        for (int i = 0; i < extrovertVsIntrovertAnswers.length; i++) {
            System.out.printf("|%5d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s |%n", questionNumberInitializer++,
                    addCheckmark(extrovertVsIntrovertAnswers[i], 1),
                    addCheckmark(extrovertVsIntrovertAnswers[1], 2), questionNumberInitializer++,
                    addCheckmark(sensingVsIntuitionsAnswers[i], 1),
                    addCheckmark(sensingVsIntuitionsAnswers[i], 2), questionNumberInitializer++,
                    addCheckmark(thinkingVsFeelingAnswers[i], 1),
                    addCheckmark(thinkingVsFeelingAnswers[i], 2), questionNumberInitializer++,
                    addCheckmark(judgingVsPerceivingAnswers[i], 1),
                    addCheckmark(judgingVsPerceivingAnswers[i], 2));
        }

        System.out.printf("%s%n", "-".repeat(74));

        System.out.printf("|%5s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d |%n", "TOTAL",
                countNum(extrovertVsIntrovertAnswers, 1), countNum(extrovertVsIntrovertAnswers, 0), " ",
                countNum(sensingVsIntuitionsAnswers, 1), countNum(sensingVsIntuitionsAnswers, 0), " ",
                countNum(thinkingVsFeelingAnswers, 1), countNum(thinkingVsFeelingAnswers, 0), " ",
                countNum(judgingVsPerceivingAnswers, 1), countNum(judgingVsPerceivingAnswers, 0));
    }
}