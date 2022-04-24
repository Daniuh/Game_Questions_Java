import java.util.Scanner;

public class Rounds {
    private Integer id;
    private Integer prizeToGet;
    private Round[] rounds = new Round[5];
    private String category;
    private static String userAnswer;

    public Rounds() {
        this.userAnswer = userAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void drawRandomQuestion() {
    }

    public void validateRound() {
    }

    static Question question = new Question();

    public static void answerQuestion() {
                Scanner answerPersonQuestion = new Scanner(System.in);

                System.out.println("Ingrese su respuesta: \n");
                userAnswer = answerPersonQuestion.nextLine();
            }

    public static void round1() {
        String[] round1possibleAnswer1 = new String[4];
        String[] round1possibleAnswer2 = new String[4];
        String[] round1possibleAnswer3 = new String[4];
        String[] round1possibleAnswer4 = new String[4];
        String[] round1possibleAnswer5 = new String[4];

        round1possibleAnswer1[0] = "A: París";
        round1possibleAnswer1[1] = "B: Washington D.C.";
        round1possibleAnswer1[2] = "C: Roma";
        round1possibleAnswer1[3] = "D: Cartagena";

        round1possibleAnswer2[0] = "A: Colombia";
        round1possibleAnswer2[1] = "B: España";
        round1possibleAnswer2[2] = "C: Italia";
        round1possibleAnswer2[3] = "D: Suiza";

        round1possibleAnswer3[0] = "A: 2 Horas";
        round1possibleAnswer3[1] = "B: 60 Segundos";
        round1possibleAnswer3[2] = "C: 10 Kilometros";
        round1possibleAnswer3[3] = "D: 60 minutos";

        round1possibleAnswer4[0] = "A: 206";
        round1possibleAnswer4[1] = "B: 300";
        round1possibleAnswer4[2] = "C: 208";
        round1possibleAnswer4[3] = "D: Cartagena";

        round1possibleAnswer5[0] = "A: Mongolia";
        round1possibleAnswer5[1] = "B: Kazajistan";
        round1possibleAnswer5[2] = "C: Estonia";
        round1possibleAnswer5[3] = "D: La Antartida";

        Round round = new Round();

        round.createQuestion1("¿Dónde está ubicada la casa blanca?", "B", round1possibleAnswer1);
        /*
         answerQuestion();

         String correctAnswer2 = question.getCorrectAnswer();
         Boolean isCorrectAnswer = question.validateResponse(userAnswer);
         System.out.println(correctAnswer2);
         System.out.println(isCorrectAnswer);

         */

        round.createQuestion2("¿Dónde nació Leonardo Da Vinci?", "C", round1possibleAnswer2);
        /*
        answerQuestion();
        String correctAnswer3 = question.getCorrectAnswer();
        Boolean isCorrectAnswer3 = question.validateResponse(userAnswer);
        System.out.println(correctAnswer3);
        System.out.println(isCorrectAnswer3);
         */
        Integer answerRandom = (int)(Math.random()*4+1);
        round.createQuestion3("¿Cuántos minutos tiene una hora?", "D", round1possibleAnswer3);
        round.createQuestion4("¿Cuántos huesos tiene el ser humano?", "B", round1possibleAnswer4);
        round.createQuestion5("¿Cuál es el lugar más frio del mundo?", "D", round1possibleAnswer4);
    }

    public static void round2() {

        String[] round2PossibleAnswer1 = new String[4];
        String[] round2possibleAnswer2 = new String[4];
        String[] round2possibleAnswer3 = new String[4];
        String[] round2possibleAnswer4 = new String[4];
        String[] round2possibleAnswer5 = new String[4];

        round2PossibleAnswer1[0] = "A: Nietzche";
        round2PossibleAnswer1[1] = "B: Piedad Bonnett";
        round2PossibleAnswer1[2] = "C: Homero";
        round2PossibleAnswer1[3] = "D: Tomas Carrasquilla";

        round2possibleAnswer2[0] = "A: Frederick Starks";
        round2possibleAnswer2[1] = "B: Lewis";
        round2possibleAnswer2[2] = "C: Sigmund Freud";
        round2possibleAnswer2[3] = "D: Merlin";

        round2possibleAnswer3[0] = "A: Gótico";
        round2possibleAnswer3[1] = "B: Clásico";
        round2possibleAnswer3[2] = "C: Romántico";
        round2possibleAnswer3[3] = "D: Seductor";

        round2possibleAnswer4[0] = "A: Los sufis";
        round2possibleAnswer4[1] = "B: Persepolis";
        round2possibleAnswer4[2] = "C: Sumisión";
        round2possibleAnswer4[3] = "D: Coran";

        round2possibleAnswer5[0] = "A: Eric Clapton";
        round2possibleAnswer5[1] = "B: Emmy Winhouse";
        round2possibleAnswer5[2] = "C: Queen";
        round2possibleAnswer5[3] = "D: Michael Jackson";

        Round round = new Round();

        round.createQuestion1("¿Quién escribió la Odisea?", "C", round2PossibleAnswer1);
        round.createQuestion2("¿Quién es el padre del psicoanalista", "C", round2possibleAnswer2);
        round.createQuestion3("¿De qué estilo arquitectónico es la Catedral de Norte en París", "D", round2possibleAnswer3);
        round.createQuestion4("¿Cuál es el libro sagrado del Islam?", "D", round2possibleAnswer4);
        round.createQuestion5("¿Qué veterano músico es la canción Tears in Heaven", "A", round2possibleAnswer4);
    }

    public static void round3() {
        String[] round3possibleAnswer1 = new String[4];
        String[] round3possibleAnswer2 = new String[4];
        String[] round3possibleAnswer3 = new String[4];
        String[] round3possibleAnswer4 = new String[4];
        String[] round3possibleAnswer5 = new String[4];

        round3possibleAnswer1[0] = "A: Estados Unidios";
        round3possibleAnswer1[1] = "B: Grecia";
        round3possibleAnswer1[2] = "C: Rusia";
        round3possibleAnswer1[3] = "D: Finlandia";

        round3possibleAnswer2[0] = "A: Belgica";
        round3possibleAnswer2[1] = "B: Portugal";
        round3possibleAnswer2[2] = "C: Mongolia";
        round3possibleAnswer2[3] = "D: Brasil";

        round3possibleAnswer3[0] = "A: Viena";
        round3possibleAnswer3[1] = "B: Praga";
        round3possibleAnswer3[2] = "C: Ibagué";
        round3possibleAnswer3[3] = "D: Budapest";

        round3possibleAnswer4[0] = "A: Francisco de Goya";
        round3possibleAnswer4[1] = "B: Diego Velázques";
        round3possibleAnswer4[2] = "C: Salvador Dalic";
        round3possibleAnswer4[3] = "D: Ronnie Coleman";

        round3possibleAnswer5[0] = "A: Flor de loto";
        round3possibleAnswer5[1] = "B: Girasoles";
        round3possibleAnswer5[2] = "C: Margaritas";
        round3possibleAnswer5[3] = "D: Auguste Rodin";

        Round round = new Round();

        round.createQuestion1("¿Dónde se originaron los juegos olimpicos?", "B", round3possibleAnswer1);
        round.createQuestion2("¿De qué país es el futbolista Cristiano Ronaldo?", "B", round3possibleAnswer2);
        round.createQuestion3("¿Cuál es la capital de Hungría", "D", round3possibleAnswer3);
        round.createQuestion4("¿Quién pinto las melinas?", "C", round3possibleAnswer4);
        round.createQuestion5("¿Cuáles son las flores más famosas pintadas por Van Gogh?", "B", round3possibleAnswer4);
    }

    public static void round4() {
        String[] round4possibleAnswer1 = new String[4];
        String[] round4possibleAnswer2 = new String[4];
        String[] round4possibleAnswer3 = new String[4];
        String[] round4possibleAnswer4 = new String[4];
        String[] round4possibleAnswer5 = new String[4];

        round4possibleAnswer1[0] = "A: Italia";
        round4possibleAnswer1[1] = "B: Francia";
        round4possibleAnswer1[2] = "C: Ecuador";
        round4possibleAnswer1[3] = "D: China";

        round4possibleAnswer2[0] = "A: Italia";
        round4possibleAnswer2[1] = "B: India";
        round4possibleAnswer2[2] = "C: Japón";
        round4possibleAnswer2[3] = "D: Arabia Saudita";

        round4possibleAnswer3[0] = "A: Catar";
        round4possibleAnswer3[1] = "B: Berlín";
        round4possibleAnswer3[2] = "C: Israel";
        round4possibleAnswer3[3] = "D: Polonia";

        round4possibleAnswer4[0] = "A: 8 de Abril";
        round4possibleAnswer4[1] = "B: 22 de Marzo";
        round4possibleAnswer4[2] = "C: 6 de Enero";
        round4possibleAnswer4[3] = "D: 24 de diciembre";

        round4possibleAnswer5[0] = "A: El apellido de un fisico matemático";
        round4possibleAnswer5[1] = "B: La religión Italiana de Campina";
        round4possibleAnswer5[2] = "C: El calcúlo de probabilidades";
        round4possibleAnswer5[3] = "D: Todas las anteriores";

        Round round = new Round();

        round.createQuestion1("¿En qué país se encuentra la torre de Pisa?", "A", round4possibleAnswer1);
        round.createQuestion2("¿En qué país se encuentra el famoso monumento Taj Mahal?", "B", round4possibleAnswer2);
        round.createQuestion3("¿A qué país pertenece la ciudad de Varsovia?", "D", round4possibleAnswer3);
        round.createQuestion4("¿Qué día celebran los cristianos la festivalidad de la epifania de Jesús?", "C", round4possibleAnswer4);
        round.createQuestion5("La campana de Gauss está asociada a:", "C", round4possibleAnswer4);
    }

    public static void round5() {
        String[] round5possibleAnswer1 = new String[4];
        String[] round5possibleAnswer2 = new String[4];
        String[] round5possibleAnswer3 = new String[4];
        String[] round5possibleAnswer4 = new String[4];
        String[] round5possibleAnswer5 = new String[4];

        round5possibleAnswer1[0] = "A: Depredación";
        round5possibleAnswer1[1] = "B: Parasitismo";
        round5possibleAnswer1[2] = "C: Mutalismo";
        round5possibleAnswer1[3] = "D: Parasitismo";

        round5possibleAnswer2[0] = "A: Consumidores secundarios";
        round5possibleAnswer2[1] = "B: Consumidores primarios";
        round5possibleAnswer2[2] = "C: Productores";
        round5possibleAnswer2[3] = "D: Descomponedores";

        round5possibleAnswer3[0] = "A: Factores bióticos";
        round5possibleAnswer3[1] = "B: Ambiente";
        round5possibleAnswer3[2] = "C: Clima";
        round5possibleAnswer3[3] = "D: Ninguna de las anteriores";

        round5possibleAnswer4[0] = "A: 206";
        round5possibleAnswer4[1] = "B: 300";
        round5possibleAnswer4[2] = "C: Morfologicas, fisiologicas y genéticas";
        round5possibleAnswer4[3] = "D: Cartagena";

        round5possibleAnswer5[0] = "A: Comunidad";
        round5possibleAnswer5[1] = "B: Biosfera";
        round5possibleAnswer5[2] = "C: Globo terraqueo";
        round5possibleAnswer5[3] = "D: Ninguna de las anteriores";

        Round round = new Round();

        round.createQuestion1("La relación recíproca positiva que se da entre individuos o poblaciones de dos especies distintas, de la cual ambas se benefician es denominada:", "C", round5possibleAnswer1);
        round.createQuestion2("¿Dónde nació Leonardo Da Vinci?", "C", round5possibleAnswer2);
        round.createQuestion3("¿Cuántos minutos tiene una hora?", "D", round5possibleAnswer3);
        round.createQuestion4("¿Cuántos huesos tiene el ser humano?", "B", round5possibleAnswer4);
        round.createQuestion5("¿Cuántos huesos tiene el ser humano?", "B", round5possibleAnswer4);
    }
    public static void main(String[] args) {
        Integer roundcurrent = 1;
        Player player = new Player();
        Game playerInformation = new Game();

        player.userRegistration();
        System.out.println(player.getName());

        playerInformation.rules();

        do {
            switch (roundcurrent) {
                case 1 -> round1();
                case 2 -> round2();
                case 3 -> round3();
                case 4 -> round4();
                case 5 -> round5();
                default -> System.out.println("Fuera de parametro");
            }
            roundcurrent++;
        }while (true);

    }
}

