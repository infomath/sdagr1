package decorator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by klb on 22.08.17.
 */
public class EmailLogger extends LoggerDecorator {
    public EmailLogger(Logger simpleLogger) {
        super(simpleLogger);
    }

    @Override
    public void log(String message) {
        super.log(message);

        System.out.println("Email " + message);
    }

    @Override
    public void clear() throws NotImplementedException {
        throw new NotImplementedException();
    }
}
