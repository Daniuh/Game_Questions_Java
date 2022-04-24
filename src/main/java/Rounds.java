public class Rounds {
    private Integer id;
    private Integer prizeToGet;
    private Round[] rounds = new Round[5];
    private String category;

    public void drawRandomQuestion() {}

    public void validateRound() {}


    public static void main(String[] args) {
        String[] possibleAnswer1 = new String [4];
        String[] possibleAnswer2 = new String [4];
        String[] possibleAnswer3 = new String [4];
        String[] possibleAnswer4 = new String [4];
        String[] possibleAnswer5 = new String [4];

        possibleAnswer1[0] = "A: París";
        possibleAnswer1[1] = "B: Washington D.C.";
        possibleAnswer1[2] = "C: Roma";
        possibleAnswer1[3] = "D: Cartagena";

        possibleAnswer2[0] = "A: Colombia";
        possibleAnswer2[1] = "B: España";
        possibleAnswer2[2] = "C: Italia";
        possibleAnswer2[3] = "D: Suiza";

        possibleAnswer3[0] = "A: 2 Horas";
        possibleAnswer3[1] = "B: 60 Segundos";
        possibleAnswer3[2] = "C: 10 Kilometros";
        possibleAnswer3[3] = "D: 60 minutos";

        possibleAnswer4[0] = "A: 206";
        possibleAnswer4[1] = "B: 300";
        possibleAnswer4[2] = "C: 208";
        possibleAnswer4[3] = "D: Cartagena";

        possibleAnswer5[0] = "A: Ah bueno";
        possibleAnswer5[1] = "B: Holi";
        possibleAnswer5[2] = "C: Me gustas";
        possibleAnswer5[3] = "D: Jija";

        Round round = new Round();
        
        round.createRound1("¿Dónde está ubicada la casa blanca?", "B", possibleAnswer1);
        round.createQuestion("¿Dónde nació Leonardo Da Vinci?", "C", possibleAnswer2);
        round.createRound3("¿Cuántos minutos tiene una hora?", "D", possibleAnswer3);
        round.createRound4("¿Cuántos huesos tiene el ser humano?", "B", possibleAnswer4);
        round.createRound5("¿Cuántos huesos tiene el ser humano?", "B", possibleAnswer4);

    }
}
