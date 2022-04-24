import java.util.Arrays;

public class Round {
        private Integer id;
        private Integer prizeToGet;
        private Question[] questions = new Question[5];
        private String category;

    /*public Round(Integer prizeToGet, Question[] questions, String category) {
        this.prizeToGet = prizeToGet;
        this.questions = questions;
        this.category = category;
    }*/

    public void createRound1(String question, String correctAnswer, String[] possibleAnswer){String[] possibleAnswer1 = new String [4];
      questions [0] = new Question(question, correctAnswer, possibleAnswer);
      String correctAnswer2 = questions[0].getCorrectAnswer();

      System.out.println(correctAnswer2);
   //   System.out.println(toString());
    }

    public void createQuestion2(String question, String correctAnswer, String[] possibleAnswer){
      questions [1] = new Question(question, correctAnswer, possibleAnswer);
     // System.out.println(toString());
    }

    public void createRound3(String question, String correctAnswer, String[] possibleAnswer){
      questions [2] = new Question(question, correctAnswer, possibleAnswer);
     // System.out.println(toString());
    }

    public void createRound4(String question, String correctAnswer, String[] possibleAnswer){
      questions [3] = new Question(question, correctAnswer, possibleAnswer);
    //  System.out.println(toString());
    }

     public void createRound5(String question, String correctAnswer, String[] possibleAnswer){
      questions [4] = new Question(question, correctAnswer, possibleAnswer);
      System.out.println(toString());
      System.out.println();
    }


    @Override
    public String toString() {
        return "Round: " + '\n' +
                Arrays.toString(questions);
    }

    public void drawRandomQuestion() {}

        public void validateRound() {}
}
