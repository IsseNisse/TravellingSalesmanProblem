import java.util.ArrayList;
import java.util.Objects;

public class node {
    private int node1;
    ArrayList<edge> edges = new ArrayList<edge>();

    /**
     * Constructor to create a new node
     *
     * @param node1
     */
    public node(int node1) {
        this.node1 = node1;
    }

    /**
     * adds the nodes to a list that keeps track of witch nodes are connected to each other
     *
     * @param edgeTotal one whole edge thats added from the graph class
     */
    public void addedge(edge edgeTotal) {
        edges.add(edgeTotal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        node node = (node) o;
        return node1 == node.node1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(node1);
    }

    /**
     * get the value of the arrayList edges
     *
     * @param node
     * @return
     */
    public ArrayList<edge> getEdges() {
        return edges;
    }

    public int getNode1() {
        return node1;
    }

    public edge getNeighbour(ArrayList<node> chosenOnes, int shortest, node currentNode, node firstNode) {
        edge chosen = null;
        for (int j = 0; j < edges.size(); j++) {
            if (!chosenOnes.contains(edges.get(j))) {
                if (shortest == 0) {
                    shortest = edges.get(j).getWeight();
                    chosen = edges.get(j);
                } else if (edges.get(j).getWeight() < shortest) {
                    chosen = edges.get(j);
                    shortest = edges.get(j).getWeight();
                }
            }
        }
        return chosen;
    }
}