package logger;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * Created by katerina on 12/27/16.
 */
public class Log4jLoggedProgram {

    private static final Logger LOGGER = Logger.getLogger(Log4jLoggedProgram.class);

    public static void main(String[] args) {
        LOGGER.info("Started with arguments: " + Arrays.toString(args));

        try {
            if (LOGGER.isDebugEnabled())  {
                LOGGER.debug("Trying to divide: 2 / 0");
            }
            int res = 2/0;
        }
        catch (Exception e) {
            LOGGER.error("Some error happer", e);
        }

    }

}
