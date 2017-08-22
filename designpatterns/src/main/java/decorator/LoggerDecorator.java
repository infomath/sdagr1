package decorator;

/**
 * Created by klb on 22.08.17.
 */
public abstract class LoggerDecorator implements Logger {

    //agregacja obiektu, ktory bedzie "dekorowany"
    protected Logger simpleLogger;

    public LoggerDecorator(Logger simpleLogger) {
        this.simpleLogger = simpleLogger;
    }


    //metoda ktora bedzie wywlywala metode log z dekorowanego obiektu
     public void log(String message) {
        //tutaj mozna ewentualnie dodac logike wspolna dla wszystkich dekoratorow
         logToFile(message);

         simpleLogger.log(message);
     }

    //metoda z dodatkowa logika
    private void logToFile(String message) {
        System.out.println("File: " + message);
    }
}
