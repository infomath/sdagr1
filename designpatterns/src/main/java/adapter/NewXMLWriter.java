package adapter;

/**
 * Created by klb on 18.08.17.
 */
public class NewXMLWriter {
    private String path;

    public NewXMLWriter(String path) {
        this.path = path;
    }

    public void write(String xml) {
        System.out.println("Nowa klasa do zapisu xml zapisala " + xml
        + " do pliku " + path);
    }
    //odpowiednik metody read ze starej klasy
    //zwraca zawartosc pliku
    public String load() {

    }
}
