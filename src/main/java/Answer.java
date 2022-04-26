import ValueObjects.Answer.IsRight;
import ValueObjects.Question.Label;

public class Answer {
    private Label label;
    private IsRight isRight;

    public Label getLabel() {
        return label;
    }

    public IsRight getIsRight() {
        return isRight;
    }
}
