import ValueObjects.Answer.IsRight;
import ValueObjects.Identifier;
import ValueObjects.Player.TotalScore;
import ValueObjects.Question.Label;
import ValueObjects.Round.PrizeToGet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Game {
    private Round currentRound;
    private List<Round> rounds;
    private Player player;

    private final Scanner read = new Scanner(in);

    public Game() {
        this.rounds = new ArrayList<>();
    }

    public void launchRound() {
        Boolean responseQuestion = this.currentRound.launchQuestion();
        Integer counter = 1;
        for (int i = 0; i <= 5; i++) {
            if (responseQuestion) {
                this.player.accumulateScore(currentRound.getPrizeToGet().getValue());
                if(counter < 5){
                    showScoreCorrectQuestion();
                    if (answerPersonContinue() == 1){
                        setCurrentRound(counter);
                        responseQuestion = this.currentRound.launchQuestion();
                        counter ++;
                    }else{
                        finishGameDecisionPerson();
                        break;
                    }
                    counterFinishGame(counter);
                }
            }else{
                finishGameFailed();
                break;
            }
        }
    }

    public void setUp() {
        List<Question> questions = new ArrayList<>();
        List<Answer> answers = new ArrayList<>();
        answers.add(new Answer(new Label("París"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Washington D.C."), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Roma"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Cartagena"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Dónde está ubicada la casa blanca?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Colombia"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Italia"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("España"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Suiza"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Dónde nació Leonardo Da Vinci?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("2 horas"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("60 segundos"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("2 kilometros"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("60 minutos"), new IsRight(Boolean.TRUE)));

        questions.add(new Question(new Label("¿Cuántos minutos tiene una hora?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("206"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("308"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("208"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Ah, no sé, tú dime"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Cuántos huesos tiene el cuerpo humano?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Mongolia"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Kazajistán"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Estonia"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("La Antártida"), new IsRight(Boolean.TRUE)));

        questions.add(new Question(new Label("¿Cuál es el lugar más frio del mundo?"), answers));
        answers.clear();

        this.rounds.add(new Round(new Identifier(), new PrizeToGet(50), questions));
        questions.clear();

        //Ronda 2

        answers.add(new Answer(new Label("Nietzsche"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Piedad Bonnetti"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Homero"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Tomas Carrasquilla"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Quién escribió la Odisea?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Frederick Starks"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Lewis"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Sigmund Freud"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Merlin"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Quién es el padre del psychoanalysis?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Gótico"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Clásico"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Romántico"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Seductor"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿De qué estilo arquitectónico es la Catedral de Norte en París?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Los sufis"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Persepolis"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Sumisión"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Coran"), new IsRight(Boolean.TRUE)));

        questions.add(new Question(new Label("¿Cuál es el libro sagrado del Islam?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Eric Clapton"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Emmy WinHouse"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Queen"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Michael Jackson"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Qué veterano músico es la canción Tears in Heaven?"), answers));
        answers.clear();
        this.rounds.add(new Round(new Identifier(), new PrizeToGet(100), questions));
        questions.clear();

        //Ronda 3

        answers.add(new Answer(new Label("Estados Unidos"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Grecia"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Rusia"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Finlandia"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Dónde se originaron los juegos olímpicos"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Belgica"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Portugal"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Mongolia"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Brasil"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿De qué país es el futbolista Cristiano Ronaldo?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Viena"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Praga"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Ibagué"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Budapest"), new IsRight(Boolean.TRUE)));

        questions.add(new Question(new Label("¿Cuál es la capital de Hungría?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Francisco de Goya"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Diego Velázquez"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Salvador Dali"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Ronnie Coleman"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Quién pinto las melinas?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Flor de loto"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Girasoles"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Margaritas"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Auguste Rodin"), new IsRight(Boolean.TRUE)));

        questions.add(new Question(new Label("¿Cuáles son las flores más famosas pintadas por Van Gogh?"), answers));
        answers.clear();

        this.rounds.add(new Round(new Identifier(), new PrizeToGet(150), questions));
        questions.clear();

        //Ronda 4

        answers.add(new Answer(new Label("Italia"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Francia"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Ecuador"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("China"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿En qué país se encuentra la torre de Pisa?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Italia"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("India"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Japón"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Arabia Saudita"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿En qué país se encuentra el famoso monumento Taj Mahal?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Catar"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Berlín"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Israel"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Polonia"), new IsRight(Boolean.TRUE)));

        questions.add(new Question(new Label("¿A qué país pertenece la ciudad de Varsovia?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("8 de Abril"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("22 de Marzo"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("6 de Enero"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("24 de diciembre"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("¿Qué día celebran los cristianos la festividad de la epifania de Jesús?"), answers));
        answers.clear();

        answers.add(new Answer(new Label("El apellido de un físico matemático"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("La religión Italiana de Campina"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("El calculo de probabilidades"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Todas las anteriores"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("La campana de Gauss está asociada a:"), answers));
        answers.clear();

        this.rounds.add(new Round(new Identifier(), new PrizeToGet(200), questions));
        questions.clear();

        //Ronda 5

        answers.add(new Answer(new Label("Depredación"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Parasitismo"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Mutualismo"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Parasitismo"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("La relación recíproca positiva que se da entre individuos o poblaciones de dos especies distintas, de la cual ambas se benefician es denominada:"), answers));
        answers.clear();


        answers.add(new Answer(new Label("Consumidores secundarios"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Consumidores primarios"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Productores"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Descomponedores"), new IsRight(Boolean.TRUE)));

        questions.add(new Question(new Label("Las bacterias y los hongos son ejemplos de:"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Factores bióticos"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Ambiente"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Clima"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Ninguna de las anteriores"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("El conjunto de condiciones físicas y biológicas que son fundamentales para la existencia y la supervivencia de los organismos es denominado:"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Morfológicas, fisiológicas y etológicas"), new IsRight(Boolean.TRUE)));
        answers.add(new Answer(new Label("Genéticas, fisiológicas y etológicas"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Morfológicas, fisiológicas y genéticas"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Ninguna de las anteriores"), new IsRight(Boolean.FALSE)));

        questions.add(new Question(new Label("Las adaptaciones en los seres vivos se clasifican en tres grandes grupos entre las que podemos mencionar:"), answers));
        answers.clear();

        answers.add(new Answer(new Label("Comunidad"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Biosfera"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Globo terráqueo"), new IsRight(Boolean.FALSE)));
        answers.add(new Answer(new Label("Ninguna de las anteriores"), new IsRight(Boolean.TRUE)));

        questions.add(new Question(new Label("En nuestro planeta hay gran diversidad de ecosistemas que en su conjunto constituyen lo que se denomina:"), answers));
        answers.clear();

        this.rounds.add(new Round(new Identifier(), new PrizeToGet(250), questions));
        questions.clear();

        this.setCurrentRound(0);
        this.rules();
        this.setPlayer();
    }

    private void setPlayer() {
        this.player = new Player(new Identifier(), new TotalScore(0));

        this.player.playerRegistration();
    }

    private void rules() {
        System.out.println("|*********( Información )*********| \n" +
                "~ Cada pregunta tiene 4 opciones. \n" +
                "~ La dificultad de las preguntas irá subiendo según la ronda en la que estés. \n" +
                "~ Son 5 rondas, cada una contiene 1 pregunta. \n" +
                "~ Si contesta la pregunta correctamente, se le darán puntos. \n" +
                "~ Si contesta incorrectamente se finalizará el juego \n " +
                "~ Al responder cada pregunta, si contesta correctamente, tendra la oportunidad de retirarse con sus puntos," +
                " si decide continuar, y en la siguiente pregunta falla, se finalizara el juego y perdera todo. \n " +
                "|*********( Buena suerte )*********|");
    }

    private void setCurrentRound(Integer index) {
        this.currentRound = this.rounds.get(index);
    }

    private void finishGameSuccess(){
        Integer finalScore = (int)this.player.getTotalScore().getValue();
        System.out.println("Felicidades " + this.player.getName().getValue() + " has finalizado correctamente. \n" +
                            "Tus puntos son: " + (finalScore + 250));
    }

    private void finishGameFailed(){
        System.out.println("Lo sentimos " + this.player.getName().getValue() + " respuesta incorrecta :( \n" +
                             "Has perdido tus puntos.");
    }

    private void finishGameDecisionPerson(){
        System.out.println(this.player.getName().getValue() + " has decidido retirarte \n" +
                "Los puntos que te llevas son: " + this.player.getTotalScore().getValue());
    }

    private Integer answerPersonContinue(){
        Integer answerPerson = 0;
        System.out.println("Desea continuar: \n" +
                        "1. Sí \n" + "2. No");
        answerPerson = this.read.nextInt();
        return answerPerson;
    }

    private void counterFinishGame(Integer counter){
        if (counter >= 5){
            finishGameSuccess();
            return;
        }
    }

    private void showScoreCorrectQuestion(){
        if(this.player.getTotalScore().getValue() != 750){
            System.out.println("+" + this.player.getTotalScore().getValue());
        }
    }
}