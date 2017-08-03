import java.util.*;

/**
 * Created by klb on 02.08.17.
 */
//T - typ wartosci kazdego wierzcholka grafu
public class Graph<T> implements GraphInterface<T> {
    Map<T, Node<T>> nodes = new HashMap<>();
    private StringBuilder txtGraph = new StringBuilder();

    @Override
    public boolean addNode(T node) {
        if(nodes.containsKey(node)) {
            return false;
        }

        Node<T> newNode = new Node<>(node);
        nodes.put(node, newNode);
        return true;
    }

    @Override
    // a->b - dodaje krawedz skierowana od wierzcholka o wartosci a do b
    public void addEdge(T a, T b) {
        Node<T> nodeA = nodes.get(a);
        Node<T> nodeB = nodes.get(b);

        if(nodeA == null) {
            nodeA = new Node<T>(a);
            nodes.put(a, nodeA);
        }

        for(Node<T> ne: nodeA.getNeighbours()) {
            if(ne.getVal().equals(b)) {
                return;  //nie dodajemy po raz kolejny krawedzi a->b
            }
        }

        if(nodeB == null) {
            nodeB = new Node<T>(b);
            nodes.put(b, nodeB);
        }

//        if(nodeA==null || nodeB==null) {
//            return false; //nie dodajemy krawedzi
//        }

        nodeA.getNeighbours().add(nodeB);
    }

    private void visit(Node<T> node) {
        node.setVisited(true);
        txtGraph.append(node.getVal()).append(" ");
        for(Node<T> n : node.getNeighbours()) {
            if(!n.isVisited()) {
                visit(n);
            }
        }
    }

    @Override
    public String searchBFS(T a) {
        txtGraph = new StringBuilder(); //restart do pustego napisu
        //kolorujemy wszystkie wezly na bialo
        for(Node<T> node : nodes.values()) {
            node.setColor(COLOR.WHITE);
        }

        //kolejka wezlow ktore trzeba odwiedzic
        Queue<Node<T>> queue = new LinkedList<>();
        Node<T> start = nodes.get(a);
        start.setColor(COLOR.GREY);
        queue.add(start);

        while(!queue.isEmpty()) {
            Node<T> node = queue.poll();
            //dodaje wszystkich bialow sasiadow (takich ktorych trzeba odwiedzic)
            //do kolejki
            for(Node<T> neigh : node.getNeighbours()) {
                if(neigh.getColor().equals(COLOR.WHITE)) {
                    neigh.setColor(COLOR.GREY);
                    queue.add(neigh);
                }
            }
            //zmieniamy kolor wezla odwiedzonego na czarny
            //po to aby nigdy juz go nie ruszyc i nie dodac do kolejki
            node.setColor(COLOR.BLACK);
            txtGraph.append(node.getVal() + " ");
        }

        return txtGraph.toString();
    }

    @Override
    public String searchDFS() {
        txtGraph = new StringBuilder(); //restart do pustego napisu
        //obiektu z reprezentacja tekstowa grafu

        for(Node<T> node : nodes.values()) {
            node.setVisited(false);
        }

        //dla kazdego niedowiedzonego wierzcholka
        for(Node<T> node : nodes.values()) {
            if(!node.isVisited()) {
                //odwiedzamy go
                visit(node);
            }
        }
        return txtGraph.toString();
    }
}
