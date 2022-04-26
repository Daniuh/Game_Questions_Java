import java.util.Arrays;
import java.util.Scanner;

public class Question {
    private Integer id = 1;
    private String question;
    private String correctAnswer;
    private String[] possibleAnswers = new String[4];

    public Question(String question, String correctAnswer, String[] possibleAnswers) {
        this.id = id++;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
    }

    public Question() {

    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }


    @Override
    public String toString() {
        return '\n' + "Pregunta = " + question + '\n' +
                "Opciones = " + Arrays.toString(possibleAnswers) + '\n' ;
    }
}
