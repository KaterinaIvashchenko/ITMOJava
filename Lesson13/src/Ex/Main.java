package Ex;

/**
 * Created by katerina on 11/23/16.
 */
public class Main {
    private short val;
    <T extends Number> Main(T arg) {
        val = arg.shortValue();
    }
}
