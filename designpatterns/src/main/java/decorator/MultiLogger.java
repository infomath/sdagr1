package decorator;


/**0. Zmodyfikuj kod tak aby każdy dekorator (nie tylko taki ktory juz jest dodany, ale rowniez
 * zostanie dodany w przyszlosci), oprocz dodatkowej logiki ktora on dodaje, rowniez loguje do pliku
 * (czyli kazdy dekorator loguje i na konsole i do pliku)
 * 1. Dodaj kolejny dekorator EmailLogger (ma logowac na konsole, do pliku, i symulowac wysylanie emaila)
 *      w przypadku metody clear rzucic wyjatek UnimplementedException
 *
 */


/**
 * konkretna klasa dekoratora
 */
public class MultiLogger extends LoggerDecorator {

    public MultiLogger(Logger simpleLogger) {
        super(simpleLogger);
    }

    @Override
    public void log(String message) {
        //logowanie na konsole
        super.log(message);

        logToFile(message);
    }

    @Override
    public void clear() {
        simpleLogger.clear();
    }

    //metoda z dodatkowa logika
    private void logToFile(String message) {
        System.out.println("File: " + message);
    }
}
