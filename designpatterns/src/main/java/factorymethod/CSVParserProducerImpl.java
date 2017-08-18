package factorymethod;

/**
 * Created by klb on 18.08.17.
 */
public class CSVParserProducerImpl //implements CSVParserProducer {
{

    private static CSVParser  csvParser = null;

    public CSVParser getInstance() {
        return new CSVParserImpl("MODE1", true, false);
    }

    public static CSVParser getSingleInstance() {
        if(csvParser == null) {
            csvParser = new CSVParserImpl("MODE1", true, false);
        }

        return csvParser;
    }
}

