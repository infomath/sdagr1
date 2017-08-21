package adapter;

/**
 * Created by klb on 18.08.17.
 */
public class XMLAdapter implements  XmlHelper {
    private NewXMLWriter writer;

    public String read(String path) {
        writer = new NewXMLWriter(path);
        return writer.load();
    }

    public void saveXML(String path, String content) {
        writer = new NewXMLWriter(path);
        writer.write(content);
    }
}
