import java.util.ArrayList;

public class node {
    private int node1;
    ArrayList<edge> edges = new ArrayList<edge>();

    /**
     * Constructor to create a new node
     * @param node1
     */
    public node(int node1) {
        this.node1 = node1;
    }

    /**
     * adds the nodes to a list that keeps track of witch nodes are connected to each other
     * @param edgeTotal one whole edge thats added from the graph class
     */
    public void addedge(edge edgeTotal) {
        edges.add(edgeTotal);
    }

    /**
     * get the value of the arrayList edges
     * @return
     * @param node
     */
    public ArrayList<edge> getEdges() {
        return edges;
    }

    public int getNode1() {
        return node1;
    }
}