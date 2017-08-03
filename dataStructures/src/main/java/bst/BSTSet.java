package bst;

/**
 * Created by klb on 03.08.17.
 */
public interface BSTSet<T> {
    int numberOfNodes();  //zwraca ilość wszystkich elementów zbioru
    BSTSet<T> mult(BSTSet<T> set2); //zwraca nowy zbiór będący wynikiem iloczynu zbiorów: tego na którym została wywołana ta metoda i zbioru set2
    BSTSet<T> sum(BSTSet<T>  set2);   // --- sumy----
    Node<T> getRoot();
}
