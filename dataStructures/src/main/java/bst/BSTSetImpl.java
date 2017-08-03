package bst;

import java.util.Stack;

/**
 * Created by klb on 03.08.17.
 */
public class BSTSetImpl<T extends Comparable> extends BSTImpl<T>
        implements BSTSet<T>   {
    protected int numOfNodes = 0;

    public Node<T> getRoot() {
        return root;
    }

    @Override
    public int numberOfNodes() {
        return numOfNodes;
    }

    @Override
    public BSTSet<T> mult(BSTSet<T> set2) {
        BSTSetImpl<T> result = new BSTSetImpl<T>();
        BSTSetImpl<T> setA;  //drzewo ktore ma mniej wezlow
        BSTSetImpl<T> setB;

        if (numOfNodes < set2.numberOfNodes()) {
            setA = this;
            setB = (BSTSetImpl)set2;
        } else {
            setB = this;
            setA = (BSTSetImpl)set2;
        }

        Stack<Node<T>> nodes = new Stack<>();
        nodes.push(setA.getRoot());
        while(!nodes.empty()) {
            Node<T> top = nodes.pop();
            if(setB.search(top.getVal())) {
                result.add(top.getVal());
            }

            if(top.getRight() !=null) {
                //dodajemy  na stos informacje ze w kolejnej iteracji odwiedzic
                //prawe dziecko
                nodes.push(top.getRight());
            }

            if(top.getLeft() !=null) {
                nodes.push(top.getLeft());
            }


        }

        return result;
    }

    @Override
    public BSTSet<T> sum(BSTSet<T> set2) {
        return null;
    }


    @Override
    public void add(T el) {
        Node<T> node = new Node<>(el);
        if(root == null) {  //gdy dodajemy nowy wezel do pustego drzewa
            root = node;
            return;
        }

        //przypadek gdy dodajemy nowy element do niepustego drzewa
        Node<T> temp = root;
        while(true) {
            if(el.compareTo(temp.getVal()) < 0) {
                if(temp.getLeft() == null) {
                    //znalezlismy wlasciwe miejsce dla wstawianego elementu
                    temp.setLeft(node);
                    numOfNodes++;
                    break;   //jesli znalezlismy miejsce na nowy element
                    //to przestajemy szukac miejsca
                } else {
                    temp = temp.getLeft();  //przechodzimy dalej w lewej czesci
                    //aby znalezc miejsce
                }
            } else if(el.compareTo(temp.getVal()) > 0){
                if(temp.getRight() == null) {
                    //znalezlismy wlasciwe miejsce dla wstawianego elementu
                    temp.setRight(node);
                    numOfNodes++;
                    break;
                } else {
                    temp = temp.getRight();
                }
            } else {
                break;
            }
        }
    }
}
