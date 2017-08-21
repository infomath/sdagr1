package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public abstract class AbstractFactory  {

    public abstract Element getElement(ELEMENT_TYPE eltype) throws NoElementException;

}
