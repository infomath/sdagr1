package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public class ComputerFactory extends AbstractFactory {

    public Element getElement(ELEMENT_TYPE eltype) throws NoElementException {
        switch(eltype) {
            case PC:
                return new PC(999999, "Turing Machine");
            case LAPTOP:
                return new Laptop(999, 1);
            default:
                throw new NoElementException();
        }
    }
}
