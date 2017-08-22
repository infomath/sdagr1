package decorator;


public class DBLogger extends LoggerDecorator {

    public DBLogger(Logger simpleLogger) {
        super(simpleLogger);
    }

    @Override
    public void log(String message) {
        System.out.println("DB " + message);
    }

    @Override
    public void clear() {
        simpleLogger.clear();
    }
}
