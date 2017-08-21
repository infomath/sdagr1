package adapter;

/**
 * Created by klb on 18.08.17.
 */
public class XmlHelperImpl implements  XmlHelper {
    public String read(String path) {
        return "zawartosc z pliku przy uzyciu starej klasy";
    }

    public void saveXML(String path, String content) {
        System.out.println("uzycie starej biblioteki");
    }
}
