/**
 * Created by klb on 27.07.17.
 */
public interface SimpleStack<T> {
    public void push(T val);

    //zwraca rozmiar
    public int size();

    //zadanie:
    //metoda tylko zwraca szczyt stosu
    public T top();

    //zwraca i usuwa szczyt
    public T pop();

}
