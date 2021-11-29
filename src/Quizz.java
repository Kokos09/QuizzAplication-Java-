import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

public class Quizz {
    private LinkedList<Question> questions;
    private Hashtable<Character, Option> dict = new Hashtable<>();
    private Hashtable<Integer, Question> questionID = new Hashtable<>();
    private Result result = new Result(0,0);
    private int questionum=1;
    public void setQuestions(LinkedList<Question> questions) {
        this.questions = questions;
    }

    public Quizz() {
        questions= new LinkedList<>();
    }
    public void showQuizz(Question question){
        questionID.put(questionum,question);
        questionum++;
        System.out.println(questionum+".-"+question.getValue());
        int countalf=97;
        for (Option option: question.getOptions()) {
            System.out.println((char) (countalf) + option.getValue());
            dict.put((char) (countalf), option);
            countalf++;
        }
    }
    public char readOption()throws OptionNotFoundException{
        Scanner scn=new Scanner(System.in);
        char option=scn.next().charAt(0);
        return option;
    }
    public void begin(){

        for(Question question: questions){
            showQuizz(question);
            try{
                char option=readOption();
                if(dict.get(option)==null){
                    throw new OptionNotFoundException("Opcion elegida no existe");
                }

                if (dict.get(option).getCorrect()) {
                    System.out.println("\n********************************************************************************\n");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Correct Answer");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("\n********************************************************************************\n");
                    int correct=result.getCorrectAnswers();
                    result.setCorrectAnswers(correct+1);
                }else{
                    System.out.println("\n********************************************************************************\n");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Wrong Answer");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("\n********************************************************************************\n");
                    int wrong=result.getWrongAnswers();
                    result.setWrongAnswers(wrong+1);
                }

            }catch (OptionNotFoundException error){
                    System.out.println(error);
                    showQuizz(questionID.get(questionum).getValue());
            }
        }
        result.showresult();
    }
}
