public interface IResult {
    void showresult();
    double obtainPercentage(int correctAnswers, int totalQuestions);
    Performance obtainPerformanceValue(double percentage);
}
