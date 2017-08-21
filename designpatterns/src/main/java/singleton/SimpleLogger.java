package singleton;

import java.util.Date;

/**
 * Created by klb on 21.08.17.
 */
public enum SimpleLogger {
    LOGGER;

    public static void log(String message, LEVEL level) {
        System.out.println(new Date().toString() + " " + level.toString() + " " + message);
    }
}
