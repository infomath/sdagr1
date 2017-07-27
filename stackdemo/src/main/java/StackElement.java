/**
 * Created by klb on 27.07.17.
 */
//struktura elmentu listy jednokierunkowej
public class StackElement<T> {
    private T value;   //wartosc elementu stosu
    private StackElement<T> next;  //wskaznik na nastepnik


    public StackElement(T value) {
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public StackElement<T> getNext() {
        return next;
    }

    public void setNext(StackElement<T> next) {
        this.next = next;
    }
}
