package adapter;

/**
 * Created by klb on 18.08.17.
 */
public interface XmlHelper {
    //zwraca zawartosc pliku
    String read(String path);

    void saveXML(String path, String content);
}
