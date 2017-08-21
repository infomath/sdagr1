package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public class ComponentFactory extends AbstractFactory {

    public Element getElement(ELEMENT_TYPE eltype) throws NoElementException {
        switch(eltype) {
            case CPU:
                return new CPU(1000, 3000);
            case RAM:
                return new RAM(1000, 3000);
                default:
                    throw new NoElementException();
        }
    }
}
