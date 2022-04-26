import ValueObjects.Answer.IsRight;
import ValueObjects.Question.Label;

public class Answer {
    private Label label;
    private IsRight isRight;

    public Answer(Label label, IsRight isRight) {
        this.label = label;
        this.isRight = isRight;
    }

    public Label getLabel() {
        return label;
    }

    public IsRight getIsRight() {
        return isRight;
    }
}
