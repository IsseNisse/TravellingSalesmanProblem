import java.util.ArrayList;
import java.util.Objects;

public class node {
    private int node1;
    ArrayList<edge> edges = new ArrayList<edge>();
    ArrayList<ArrayList<node>> path = new ArrayList<>();

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

    void printArr(ArrayList<node> a, int n) {
        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i).toString() + " ");
        System.out.println();
    }

    ArrayList<ArrayList<node>> heapPermutation(ArrayList<node> a, int size, int n, node firstNode) {

        if (size == 1) {
            ArrayList<node> copy = new ArrayList<>(a);
            path.add(copy);
            printArr(a, n);
        }

        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n, firstNode);

            if (size % 2 == 1) {
                node temp = a.get(0);
                a.set(0, a.get(size - 1));
                a.set(size - 1, temp);
            } else {
                node temp = a.get(i);
                a.set(i, a.get(size - 1));
                a.set(size - 1, temp);
            }
        }
        return path;
    }

    public edge getEdge(node firstNode) {
        edge edge = null;
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getNode1().equals(firstNode)) {
                edge = edges.get(i);
            } else if (edges.get(i).getNode2().equals(firstNode)) {
                edge = edges.get(i);
            }
        }
        return edge;
    }
}