/**
 * Created by klb on 27.07.17.
 */
public class SimpleStackImpl<T> implements SimpleStack<T>{
    private StackElement<T> bottom = null;  //dno stosu
    private StackElement<T> top = null;  //szczyt stosu
    private int size = 0;

    //          top
    //top: null<-2<-1 :bottom

    public void push(T val) {
        StackElement<T> newElement = new StackElement<T>(val);

        //przypadek gdy nowy element dodajemy do pustego stosu
        if(size == 0) {
            bottom = newElement;  //bottom wskazuje na nowy element
            top = newElement;
        } else {
            //przypadek gdy dodajemy element do stosu niepustego
            //1. nastepnik starego szczytu ma wskazywac na nowy element
            top.setNext(newElement);
            //2. aktualizacja szczytu
            top = newElement;
        }
        size++;
    }

    @Override
    public  String toString() {  //top: 0 1 2 3
        //         t
        //top:   null<-0 <-1<-2<-3 bottom
        StringBuilder result = new StringBuilder();
        StackElement<T> temp = bottom;  //pomocnicza referencja po to
        //aby nie poprzestawiac referencji bottom i top
        //temp wskazuje na to na co wskazuje
        //bottom

        //dopoki nie dojedziemy do konca stosu
        while(temp != null) {
            result.append(temp.getValue().toString()).append(" ");

            //przejscie do kolejnego elementy
            temp = temp.getNext();
        }

        return "top: " + result.reverse().toString() + " bottom";
    }

    public int size() {
        return 0;
    }

    public T top() {
        return null;
    }

    public T pop() {
        return null;
    }


}
