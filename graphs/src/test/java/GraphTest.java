import org.junit.Test;

/**
 * Created by klb on 02.08.17.
 */

/*
          1->2->3<-4
          \----/
 */
public class GraphTest {

    //a->b<-c

    @Test
    public void djkstraTest() {
        Graph<Character> graph = new Graph<>();
        graph.addNode('a');
        graph.addNode('b');
        graph.addNode('c');
        graph.addNode('d');
        graph.addNode('e');

        graph.addEdge('a', 'b', 3);
        graph.addEdge('a', 'c', 7);
        graph.addEdge('b', 'c', 2);
        graph.addEdge('c', 'd', 1);
        graph.addEdge('b', 'e', 4);
        graph.addEdge('d', 'a', 2);

        String path = graph.djkstraAlgo('a', 'd');
        System.out.println(path);
    }

    @Test
    public void test1() {
        Graph<Integer> graph = new Graph<>();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);

        graph.addEdge(1, 2, 0);
        graph.addEdge(2, 3, 0);
        graph.addEdge(3, 1, 0);
        graph.addEdge(4, 3, 0);
        graph.addEdge(3, 4, 0);
        graph.addEdge(4, 5, 0);
        graph.addEdge(4, 5, 0);
        String sgraph = graph.searchDFS();
        System.out.println("DFS: " + sgraph);
        System.out.println("BFS: " + graph.searchBFS(1));

    }
}
