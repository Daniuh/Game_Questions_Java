import Utils.Misc;
import ValueObjects.Identifier;
import ValueObjects.Round.PrizeToGet;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private Identifier id;
    private PrizeToGet prizeToGet;
    private List<Question> questions;

    public Round(Identifier id, PrizeToGet prizeToGet, List<Question> questions) {
        this.id = id;
        this.prizeToGet = prizeToGet;
        this.questions = new ArrayList<>(questions);
    }

    public PrizeToGet getPrizeToGet() {
        return prizeToGet;
    }

    public Boolean launchQuestion(){
        Question question = this.getRandomQuestion();
        return question.replyQuestion();
    }

    private Question getRandomQuestion (){
        return this.questions.get(Misc.generateRandom(this.questions.size()));
    }
}
