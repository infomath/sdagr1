package factorymethod;

/**
 * Created by klb on 18.08.17.
 */
public class Main {

    public static void main(String[] args) {
        CSVParser csvParser = CSVParserProducerImpl.getSingleInstance();
        csvParser.parse("file.csv");

        CSVParser csvParser2 = CSVParserProducerImpl.getSingleInstance();

        System.out.println(csvParser == csvParser2);

        CSVParser csvParser3 = new CSVParserProducerImpl().getInstance();
        System.out.println(csvParser == csvParser3);
    }
}
