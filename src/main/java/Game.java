import java.util.Scanner;

public class Game {
    private Integer currentRound;
    private Integer round;
    private Player player;
    
   public void rules(){
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
   Rounds rounds = new Rounds();
}