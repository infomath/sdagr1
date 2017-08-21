import org.junit.Test;
import singleton.LEVEL;
import singleton.Logger;
import singleton.SimpleLogger;

import static org.junit.Assert.assertTrue;


/**
 * Created by klb on 21.08.17.
 */
public class LoggerTest {

    @Test
    public void testLogMethod() {
        Logger logger = Logger.getInstance();
        logger.log("hello", LEVEL.INFO);

    }

    @Test
    public void testReferences() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertTrue(logger1 == logger2);
    }

    @Test
    public void testEnumSingleton() {
        SimpleLogger.LOGGER.log("hello2", LEVEL.INFO);
        SimpleLogger l1 = SimpleLogger.LOGGER;
        SimpleLogger l2 = SimpleLogger.LOGGER;
        assertTrue(l1 == l2);
    }
}
