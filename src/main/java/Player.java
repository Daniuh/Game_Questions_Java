import java.util.Scanner;

public class Player {
    private Integer id;
    private String name;
    private Integer cumulativeScore;

    public Player(){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accumulateScore() {}

    public void userRegistration(){
        Scanner player = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        this.name = player.nextLine();
    }
    
    public void rules() {
        System.out.println();
    }
}
