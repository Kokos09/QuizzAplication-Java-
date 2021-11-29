import java.util.LinkedList;

public class Question {

    private String value;
    private LinkedList<Option> options;

    public Question(String value,LinkedList <Option> options) {
        this.value = value;
        this.options=options;
    }

    public LinkedList<Option> getOptions() {
        return options;
    }

    public void setOptions(LinkedList<Option> options) {
        this.options = options;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
