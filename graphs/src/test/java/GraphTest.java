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
    public void test1() {
        Graph<Integer> graph = new Graph<>();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(4, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 5);
        String sgraph = graph.searchDFS();
        System.out.println("DFS: " + sgraph);
        System.out.println("DFS: " + graph.searchBFS(1));

    }
}
