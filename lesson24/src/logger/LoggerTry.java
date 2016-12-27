package logger;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by katerina on 12/19/16.
 */

public class LoggerTry {

    private static final Logger LOGGER =
            Logger.getLogger(LoggerTry.class.getName());
    static {

        LOGGER.setLevel(Level.SEVERE); }
    public static void main(String[] args) {

        LOGGER.info("Started with arguments: " + Arrays.toString(args));
        try {
            int res = 2 / 0;

            LOGGER.info("This code should never be called"); }
        catch (Exception e) {

            LOGGER.severe("Fatal error: " + e.getMessage()); }
    }
}
