package Utils;

import java.util.Random;

public class Misc {

    public static Integer generateRandom(Integer max) {
        Random random = new Random();
        return random.nextInt(max + 1) + 1;
    }
}