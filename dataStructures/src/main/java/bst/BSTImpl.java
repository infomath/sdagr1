package bst;

import java.util.Stack;

/**  + 14
 *                  10
 *                     15
 *                  null
 */
public class BSTImpl<T extends Comparable> implements BST<T> {

    protected Node<T> root = null;

    public Node<T> getRoot() {
        return root;
    }

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
                    break;   //jesli znalezlismy miejsce na nowy element
                    //to przestajemy szukac miejsca
                } else {
                    temp = temp.getLeft();  //przechodzimy dalej w lewej czesci
                    //aby znalezc miejsce
                }
            } else {
                if(temp.getRight() == null) {
                    //znalezlismy wlasciwe miejsce dla wstawianego elementu
                    temp.setRight(node);
                    break;
                } else {
                    temp = temp.getRight();
                }
            }
        }

    }

    //zwraca true gdy w drzewie istnieje wezel o wartosci el

    //zlozonosc w przypadku optymistycznym (gdy drzewo jest zrownowazone,czyli wysokosc
    //jest log2(n)) wynosi log2(n), natomiast w przypadku pesymistycznym (gdy drzewo
    //przybierze postac listy) jest O(n)

    public boolean search(T el) {
        Node<T> node = root;
        while(true) {
            if(node == null) {
                return false;
            }
            if(node.getVal().compareTo(el) == 0) {
                return true;
            }
            if(node.getVal().compareTo(el) < 0) {
                node = node.getRight();
                continue;
            }
            node = node.getLeft();
        }
    }



    //zwraca rekurencyjnie wygenerowany napis ktory jest textowa
    //reprezentacja drzewa BST
    private String showRek(Node<T> node) {
        if(node == null) {
            return "";
        }

        //porzadek in order
        return showRek(node.getLeft()) + //wygenerowanie lewego poddrzewa
                " " + node.getVal() + " " + //dodanie wartosci biezacego noda
        showRek(node.getRight());
    }

    private String showIter() {
        StringBuilder result = new StringBuilder();
        Stack<Node<T>> nodes = new Stack<>();
        nodes.push(root);
        while(!nodes.empty()) {
            Node<T> top = nodes.pop();
            result.append(top.getVal()).append(" ");

            if(top.getRight() !=null) {
                nodes.push(top.getRight());
            }

            if(top.getLeft() !=null) {
                nodes.push(top.getLeft());
            }


        }
        return result.toString();
    }


    public String show() {
       // return showRek(root);
        return showIter();
    }
}
