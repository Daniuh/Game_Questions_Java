import java.util.Arrays;
import java.util.Scanner;

public class Round {
    private Integer id;
    private Integer prizeToGet;
    private Question[] questions = new Question[5];
    private String category;
    private String playGame;

    public Round() {
        this.playGame = playGame;
    }


    public String getPlayGame() {
        return playGame;
    }

    public void answerPlayGame(){
        Scanner answerPerson = new Scanner(System.in);

        System.out.println("Ingrese: 1 \n" + "Para poder iniciar el juego");

    }

    public void createQuestion1(
            String question,
            String correctAnswer,
            String[] possibleAnswer) {
        String[] possibleAnswer1 = new String[4];
        questions[0] = new Question(question, correctAnswer, possibleAnswer);
      /*  String correctAnswer2 = questions[0].getCorrectAnswer();
            Boolean isCorrectAnswer = questions[0].validateResponse(userAnswer);

        System.out.println(correctAnswer2);
                System.out.println(isCorrectAnswer);*/

            //   System.out.println(toString());
    }


    public void createQuestion2(String question, String correctAnswer, String[] possibleAnswer) {
        questions[1] = new Question(question, correctAnswer, possibleAnswer);
       /* answerQuestion();
        String correctAnswer2 = questions[1].getCorrectAnswer();
        Boolean isCorrectAnswer = questions[1].validateResponse(userAnswer);

                System.out.println(correctAnswer2);
                        System.out.println(isCorrectAnswer);*/
        // System.out.println(toString());
    }

    public void createQuestion3(String question, String correctAnswer, String[] possibleAnswer) {
        questions[2] = new Question(question, correctAnswer, possibleAnswer);
        // System.out.println(toString());
    }

    public void createQuestion4(String question, String correctAnswer, String[] possibleAnswer) {
        questions[3] = new Question(question, correctAnswer, possibleAnswer);
        //  System.out.println(toString());
    }

    public void createQuestion5(String question, String correctAnswer, String[] possibleAnswer) {
        questions[4] = new Question(question, correctAnswer, possibleAnswer);
        System.out.println(toString());
        System.out.println();
    }


    @Override
    public String toString() {
        return "Round: " + '\n' +
                Arrays.toString(questions);
    }

    public void drawRandomQuestion() {
    }

    public void validateRound() {
    }
}
