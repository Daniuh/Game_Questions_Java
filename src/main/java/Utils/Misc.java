package Utils;

import java.util.Random;

public class Misc {

    public static Integer uuid(Integer max, Integer min) {
        Random random = new Random();
        return random.nextInt(max + min);
    }
}