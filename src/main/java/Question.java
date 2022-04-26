import ValueObjects.Question.Label;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class Question {
private Label label;
private List<Answer> answers;

private final Scanner read = new Scanner(in);

    public Question(Label label, List<Answer> answers) {
        this.label = label;
        this.answers = answers;
    }

    public Boolean replyQuestion(){
      System.out.println(this.label);

      for (int i = 0; i < answers.size(); i++) {
          System.out.println(i + 1 + " " + answers.get(i).getLabel().getValue());
      }

      System.out.println("Ingrese el número de la respuesta: ");
      return this.validateResponse(read.nextInt());
    }

    private Boolean validateResponse(Integer userResponse){
        return this.answers.get(userResponse).getIsRight().getValue();
    }
}
