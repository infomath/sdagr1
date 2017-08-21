package singleton;

import java.util.Date;

/**
 * Created by klb on 21.08.17.
 */
public class Logger {

    private static Logger instance = null;

    private Logger() {

    }

    public static Logger getInstance() {
        //gdy ktos po raz pierwszy uzywa tej metody
        if(instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public static void log(String message, LEVEL level) {
        System.out.println(new Date().toString() + " " + level.toString() + " " + message);
    }
}
