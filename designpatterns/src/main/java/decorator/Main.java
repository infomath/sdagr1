package decorator;

/**
 * Created by klb on 22.08.17.
 */
public class Main {

    public static void main(String[] args) {
        SimpleLogger slogger = new SimpleLogger();
        slogger.log("test1");

        MultiLogger multiLogger = new MultiLogger(slogger);
        multiLogger.log("test2");
    }
}
