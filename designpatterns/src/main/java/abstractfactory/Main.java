package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public class Main {

    public static void main(String[] args) {
        ComponentFactory componentFactory = new ComponentFactory();
        try {
            Element el = componentFactory.getElement(ELEMENT_TYPE.CPU);
            CPU cpu = (CPU)el;
            System.out.println(cpu.getFrequency());

        } catch (NoElementException e) {
            e.printStackTrace();
        }
    }
}
