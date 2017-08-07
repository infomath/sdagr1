/**
 * Created by klb on 07.08.17.
 */
public class Edge<T> {
    private int distance;  //dlugosc krawedzi

    //wierzcholek koncowy (docelowy) krawedzi
    private Node<T> node;

    public Edge(int distance, Node<T> node) {
        this.distance = distance;
        this.node = node;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }
}
