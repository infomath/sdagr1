import java.util.*;

/**
 * Created by klb on 02.08.17.
 */
//T - typ wartosci kazdego wierzcholka grafu
public class Graph<T> implements GraphInterface<T> {
    Map<T, Node<T>> nodes = new HashMap<>();  //wszystkie wierzcholki grafu i krawedzie prowadzace do sasiadow
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
    public void addEdge(T a, T b, int distance) {
        Node<T> nodeA = nodes.get(a);
        Node<T> nodeB = nodes.get(b);

        if(nodeA == null) {
            nodeA = new Node<T>(a);
            nodes.put(a, nodeA);
        }

        for(Edge<T> ne: nodeA.getNeighbours()) {
            if(ne.getNode().getVal().equals(b)) {
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

        Edge<T> edge = new Edge<T>(distance, nodeB);
        nodeA.getNeighbours().add(edge);
    }

    private void visit(Node<T> node) {
        node.setVisited(true);
        txtGraph.append(node.getVal()).append(" ");
        for(Edge<T> n : node.getNeighbours()) {
            if(!n.getNode().isVisited()) {
                visit(n.getNode());
            }
        }
    }

   //1. wypelnic "tablice" zaw. info. to. najkrotszych sciezek z wierzcholka startowego do wszystkich
    //pozostalych wierzcholkow
    //2. Wygenerowac najkrotsza sciezke z wierzcholka startowego do wybranego - podanego jako argument metody
    public String djkstraAlgo(T start, T to) {
        PriorityQueue<Node<T>> pq = new PriorityQueue<>(nodes.size(), new QueuePriorityStrategy());
        for(Map.Entry<T, Node<T>> entry : nodes.entrySet()) {
            if(entry.getValue().getVal().equals(start)) {
                entry.getValue().setMinDistace(0);
            } else {
                entry.getValue().setMinDistace(Integer.MAX_VALUE);
            }
            pq.add(entry.getValue());
        }

        while(!pq.isEmpty()) {  // ... u ---distance---> v
            Node<T> u = pq.poll();
            //dla kazdej krawedzi incydentnej, prowadzej do sasiada wierzcholka node
            for(Edge<T> v : u.getNeighbours()) {
                if(v.getNode().getMinDistace() > u.getMinDistace() + v.getDistance()) {
                        v.getNode().setMinDistace(u.getMinDistace() + v.getDistance());
                        pq.remove(v.getNode());
                        pq.add(v.getNode());
                        v.getNode().setParent(u);
                    }
                }
            }


        //test
        String graph = searchBFS(start);
        System.out.println("minDostances:");
        System.out.println(graph);

        StringBuilder sb = new StringBuilder();
        Node<T> node = nodes.get(to);
        while(node != null) {
            sb.append(node.getVal()).append(" ");
            node = node.getParent();
        }

        return sb.toString();
    }

    private class QueuePriorityStrategy implements Comparator<Node<T>> {
        @Override
        public int compare(Node<T> n1, Node<T> n2) {
            return n1.getMinDistace().compareTo(n2.getMinDistace());
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
            for(Edge<T> neigh : node.getNeighbours()) {
                if(neigh.getNode().getColor().equals(COLOR.WHITE)) {
                    neigh.getNode().setColor(COLOR.GREY);
                    queue.add(neigh.getNode());
                }
            }
            //zmieniamy kolor wezla odwiedzonego na czarny
            //po to aby nigdy juz go nie ruszyc i nie dodac do kolejki
            node.setColor(COLOR.BLACK);
            txtGraph.append(node.getVal() + " ");
            txtGraph.append("minDistance: " + node.getMinDistace() + "; ");
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

    //
}
