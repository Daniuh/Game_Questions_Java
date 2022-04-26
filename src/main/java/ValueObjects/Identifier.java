package ValueObjects;

import Utils.Misc;

public class Identifier {
    private Integer value;

    public Identifier() {
        this.value = Misc.generateRandom(100,0);
    }

    public Integer getValue() {
        return value;
    }
}