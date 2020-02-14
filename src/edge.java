public class edge {
    private node node1;
    private node node2;
    private int weight;

    /**
     * Constructor to create a new edge
     * @param node1 the from node
     * @param node2 the to node
     * @param weight the weight of the edge
     */
    public edge(node node1, node node2, int weight) {
        this.node1 = node1;
        this.node2 = node2;
        this.weight = weight;
    }

    /**
     * get the value of node1
     * @return
     */
    public node getNode1() {
        return node1;
    }

    /**
     * get value of node2
     * @return
     */
    public node getNode2() {
        return node2;
    }

    /**
     * get value of weight
     * @return
     */
    public int getWeight() {
        return weight;
    }

    public node getOtherNode(node currentNode) {
        if (node1.equals(currentNode)) {
            return node2;
        } else {
            return node1;
        }
    }
}