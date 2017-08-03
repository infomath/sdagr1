import java.util.LinkedList;
import java.util.List;

/**
 * Created by klb on 02.08.17.
 */
public class Node<T> {
    private T val;
    private List<Node<T>> neighbours;
    private boolean visited;
    private COLOR color;

    public Node(T val) {
        this.val = val;
        neighbours = new LinkedList<Node<T>>();
        visited = false;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public List<Node<T>> getNeighbours() {
        return neighbours;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }
}
