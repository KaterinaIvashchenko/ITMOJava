package Singleton;

/**
 * Created by katerina on 12/4/16.
 */
public class Configuration {

    private static Configuration instance;
    private static double sout;

    private Configuration() {
        sout = Math.random();
    }

    public void print() {
        System.out.println(sout);
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }

        return instance;
    }
}
