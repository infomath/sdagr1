package adapter;

/**
 * Created by klb on 18.08.17.
 */
public class Utils {

    public void generateReport(String data, XmlHelper writer) {
        writer.saveXML("c:\\test.xml", data);
    }
}
