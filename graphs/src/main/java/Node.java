import java.util.LinkedList;
import java.util.List;

/**
 * Created by klb on 02.08.17.
 */
public class Node<T> {
    private T val;
    private List<Edge<T>> neighbours;  //sasiedzi do ktorych mozna przejsc z biezacego wierzcholka
    private boolean visited;
    private COLOR color;
    private Integer minDistace;   //najkrotsza droga prowadzaca z wierzcholka startowego do tego wierzcholka
    private Node<T> parent;  //referencja do takiego rodzica tego wierzcholka, do ktorego mozna najszybciej
    //przejsc z wierzcholka startowego

    public Node(T val) {
        this.val = val;
        neighbours = new LinkedList<Edge<T>>();
        visited = false;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public List<Edge<T>> getNeighbours() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        return val.equals(node.val);
    }

    public void setNeighbours(List<Edge<T>> neighbours) {
        this.neighbours = neighbours;
    }

    public Integer getMinDistace() {
        return minDistace;
    }

    public void setMinDistace(Integer minDistace) {
        this.minDistace = minDistace;
    }

    @Override
    public int hashCode() {
        return val.hashCode();
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
}
