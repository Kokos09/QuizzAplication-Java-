public class Result {

     private int correctAnswers;
     private int wrongAnswers;
     private int total;

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(int wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    public Result() {
        this.correctAnswers = 0;
        this.wrongAnswers = 0;
        this.total=0;
    }

    public Result(int correctAnswers, int wrongAnswers) {
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
        this.total=correctAnswers+wrongAnswers;
    }

    public void showresult() {
        System.out.println("Your Result:");
        System.out.println("Total Answers:         "+(correctAnswers+wrongAnswers));
        System.out.println("correct Answers:       "+correctAnswers);
        System.out.println("Wrong Answers:         "+wrongAnswers);
        System.out.println("Percentage:            "+obtainPercentage(correctAnswers,(correctAnswers+wrongAnswers)));
        System.out.println("Overall performance:   "+obtainPerformanceValue(obtainPercentage((correctAnswers+wrongAnswers),correctAnswers)));
    }

    public double obtainPercentage(int correctAnswers,int total) {
        return ((double) correctAnswers/total);
    }

    public Performance obtainPerformanceValue(double percentage) {
        if(percentage>=90){
             return Performance.GOOD;
        }else if (percentage<=40){
            return  Performance.POOR;
        }else if (percentage<=89){
            return Performance.AVERAGE;
        }
        return Performance.ERROR;
    }
}
