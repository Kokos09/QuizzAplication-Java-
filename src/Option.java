public class Option {
    private String value;
    private Boolean isCorrect;

    public Option() {
    }

    public Option(String value, Boolean isCorrect) {
        this.value = value;
        this.isCorrect=isCorrect;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public String getValue() {
        return value;
    }
}
