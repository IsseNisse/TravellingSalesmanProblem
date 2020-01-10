public class edge {
    private node node1;
    private node node2;
    private int weight;

    public edge(node node1, node node2, int weight) {
        this.node1 = node1;
        this.node2 = node2;
        this.weight = weight;
    }

    public node getNode1() {
        return node1;
    }

    public node getNode2() {
        return node2;
    }

    public int getWeight() {
        return weight;
    }
}