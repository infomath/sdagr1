package bst;

/**  + 14
 *                  10
 *                     15
 *                  null
 */
public class BSTImpl<T extends Comparable> implements BST<T> {

    private Node<T> root = null;

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
    public boolean search(T el) {
        return false;
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

    public String show() {
        return showRek(root);
    }
}
