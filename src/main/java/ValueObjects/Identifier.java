package ValueObjects;

public class Identifier {
    String value;

    public Identifier(Long value) {
        this.value = value.toString();
    }
}
