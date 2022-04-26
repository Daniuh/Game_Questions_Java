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

    public Boolean launchQuestion(){
        Question question = this.getRandomQuestion();
        return question.replyQuestion();
    }

    private Question getRandomQuestion (){
        return this.questions.get(Misc.generateRandom(4,0));
    }



    /*
    public void answerPlayGame(){
        Scanner answerPerson = new Scanner(System.in);

        System.out.println("Ingrese: 1 \n" + "Para poder iniciar el juego");
    }

    public String createQuestion1(
            String question,
            String correctAnswer,
            String[] possibleAnswer) {
        String[] possibleAnswer1 = new String[4];
        questions[0] = new Question(question, correctAnswer, possibleAnswer);
       String correctAnswer2 = questions[0].getCorrectAnswer();
            Boolean isCorrectAnswer = questions[0].validateResponse(userAnswer);

        System.out.println(correctAnswer2);
                System.out.println(isCorrectAnswer);

              System.out.println(toString());
        return question;
    }

    public String createQuestion2(String question, String correctAnswer, String[] possibleAnswer) {
        questions[1] = new Question(question, correctAnswer, possibleAnswer);
       answerQuestion();
        String correctAnswer2 = questions[1].getCorrectAnswer();
        Boolean isCorrectAnswer = questions[1].validateResponse(userAnswer);

                System.out.println(correctAnswer2);
                        System.out.println(isCorrectAnswer);
        System.out.println(toString());
        return question;
    }

    public String createQuestion3(String question, String correctAnswer, String[] possibleAnswer) {
        questions[2] = new Question(question, correctAnswer, possibleAnswer);
        System.out.println(toString());
        return question;
    }

    public String createQuestion4(String question, String correctAnswer, String[] possibleAnswer) {
        questions[3] = new Question(question, correctAnswer, possibleAnswer);
        //  System.out.println(toString());
        return question;
    }

    public String createQuestion5(String question, String correctAnswer, String[] possibleAnswer) {
        questions[4] = new Question(question, correctAnswer, possibleAnswer);
        System.out.println();
        return question;
    }
    @Override
    public String toString() {
        return "Pregunta: " + '\n' +
                "Este toString es el de ronda" +
                Arrays.toString(questions);
    }

     */
}
