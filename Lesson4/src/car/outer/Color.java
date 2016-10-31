package car.outer;

/**
 * Created by katerina on 10/31/16.
 */
public class Color {


    public enum Type{
        METALIC,
        NON_METALIC;
    }
    private final int value;
    private final Type type;
    public Color(int value, Type type) {
        this.value = value;
        this.type = type;
    }


}
