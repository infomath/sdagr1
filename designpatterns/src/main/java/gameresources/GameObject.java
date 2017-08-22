package gameresources;

/**
 * Created by klb on 22.08.17.
 */
public class GameObject {

    private GAMEOBJECTS name;
    private Byte[] graph;

    public GameObject(GAMEOBJECTS name, Byte[] graph) {
        this.name = name;
        this.graph = graph;
        loadGraphics();
    }

    private void loadGraphics() {

    }

    public GAMEOBJECTS getName() {
        return name;
    }

    public void setName(GAMEOBJECTS name) {
        this.name = name;
    }

    public Byte[] getGraph() {
        return graph;
    }

    public void setGraph(Byte[] graph) {
        this.graph = graph;
    }
}
