import Utils.Misc;
import ValueObjects.Identifier;
import ValueObjects.Round.Category;
import ValueObjects.Round.PrizeToGet;
import java.util.List;

public class Round {
    private Identifier id;
    private PrizeToGet prizeToGet;
    private List<Question> questions;
    private Category category;

    public Round(Identifier id, PrizeToGet prizeToGet, List<Question> questions, Category category) {
        this.id = id;
        this.prizeToGet = prizeToGet;
        this.questions = questions;
        this.category = category;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public Boolean launchQuestion(){
        Question question = this.getRandomQuestion();
        return question.replyQuestion();
    }

    private Question getRandomQuestion (){
        System.out.println(this.questions.size());
        return this.questions.get(Misc.generateRandom(this.questions.size()));
    }
}
