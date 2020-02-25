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
            if (!chosenOnes.contains(edges.get(j).getOtherNode(currentNode))) {
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

    void printArr(ArrayList<edge> a, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a.get(i) + " ");
        System.out.println();
    }

    void heapPermutation(ArrayList<edge> a, int size, int n, node firstNode) {
        ArrayList<edge> edges = new ArrayList<>();
        ArrayList<edge> path = new ArrayList<>();
        edge e = a.get(a.size() - 1);
        edge home = null;
        node node = e.getOtherNode(firstNode);
        for (int j = 0; j < node.getEdges().size(); j++) {
            ArrayList<edge> lastEdges = node.getEdges();
            if (lastEdges.contains(firstNode.getEdges().get(j))) {
                home = lastEdges.get(j);
            }
        }

        if (size == 1)
            a.add(home);
            printArr(a,n);

        for (int i = 0; i < size; i++) {
            heapPermutation(a, size -1, n, firstNode);

            if (size % 2 == 1) {
                edge temp = a.get(0);
                a.set(0, a.get(size - 1));
                a.set(size - 1, temp);
            } else {
                edge temp = a.get(i);
                a.set(i, a.get(size - 1));
                a.set(size - 1, temp);
            }
        }
    }
}