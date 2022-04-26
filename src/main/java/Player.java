import ValueObjects.Identifier;
import ValueObjects.Player.Name;
import ValueObjects.Player.TotalScore;
import java.util.Scanner;
import static java.lang.System.in;

public class Player {
    private Identifier id;
    private Name name;
    private TotalScore totalScore;

    private final Scanner player = new Scanner(in);

    public Player(Identifier id, TotalScore totalScore) {
        this.id = id;
        this.totalScore = totalScore;
    }

    public Name getName() {
        return name;
    }

    public void accumulateScore(Integer score) {
        this.totalScore = new TotalScore(this.totalScore.getValue() + score);
    }

    public void playerRegistration(){
        System.out.println("Ingrese su nombre");
        this.setName(player.nextLine());
    }

    private void setName(String name) {
        this.name = new Name(name);
    }
}
