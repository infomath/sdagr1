package adapter;

/**
 * Wzorzec adapter stosuje sie wtedy gdy trzeba
 * zastapic np. jakas biblioteke (klase) nowa wersje
 * Poniewaz nowa wersja moze miec inne nazwy metod (metody moga tez
 * miec inne argumenty) - integracja nowej biblioteki bez
 * uzycia tego wzorca wymagalaby wielu zmian => wzorzec redukuje ilosc zmian
 */
public class Main {

    private static void generateReport(String data, XmlHelper writer) {
        writer.saveXML("c:\\test.xml", data);
    }

    private static void loadReport(XmlHelper writer, String path) {
        System.out.println(writer.read(path));
    }


    //dodac metode ktora jako argument przyjmuje obiekt do wczytania pliku

    public static void main(String[] args) {
        generateReport("abcd", new XMLAdapter());
        Utils utils = new Utils();
        utils.generateReport("xyz", new XMLAdapter());

        loadReport(new XMLAdapter(), "C;\test.txt");
    }
}
