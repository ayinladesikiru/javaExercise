package tddClass;

import org.junit.jupiter.api.Test;

public class RandomQuestionaireTest {
    @Test
    public void testForQuizGen(){
        QuizGenerator QuizGen = new QuizGenerator();
        QuizGen.randomQuestion();
    }
}
