package decorator;

/**
 * Prosta klasa loggera, do wypisywania informacji w konsoli
 */
public class SimpleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Console: " + message);
    }

    @Override
    public void clear() {
        System.out.println("Removing logs..");
    }
}
