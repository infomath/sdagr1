/**
 * Created by klb on 02.08.17.
 */
public interface GraphInterface<T> {

    //wartosci wierzcholkow nie powtarzaja sie w grafie
    //dodaje nowy wierzcholek do grafu
    boolean addNode(T node);
    void addEdge(T a, T b);
    String searchDFS();

    //a - wartosc wezla od ktorego metoda zacznie przeszukiwac graf
    String searchBFS(T a);
}
