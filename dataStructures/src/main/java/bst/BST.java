package bst;

public interface BST<T extends Comparable> {
    void add(T el);
    boolean search(T el);
    String show();
}
