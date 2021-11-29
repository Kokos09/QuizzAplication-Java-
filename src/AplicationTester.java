import java.util.Arrays;
import java.util.LinkedList;

public class AplicationTester {
    private Quizz quizz;


    public AplicationTester() {
        quizz = new Quizz();

    }
    public Question getQuestion(String question,LinkedList<Option> options){
        return new Question(question, options);
    }

    public void testApp() {

        LinkedList<Question> questions = new LinkedList<Question>();
        questions.add(getQuestion("2+2",new LinkedList<Option>(Arrays.asList(new Option("1", false)
                , new Option("2", false)
                , new Option("3", false)
                , new Option("4", true)
        ))));
        questions.add(getQuestion("4+4",new LinkedList<Option>(Arrays.asList(new Option("6", false)
                , new Option("7", false)
                , new Option("8", true)
                , new Option("9", false)
        ))));
        questions.add(getQuestion("8+8",new LinkedList<Option>(Arrays.asList(new Option("12", false)
                , new Option("11", false)
                , new Option("15", false)
                , new Option("16", true)
        ))));
        quizz.setQuestions(questions);
        quizz.begin();
    }
}
