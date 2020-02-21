public class BruteForce {

    public static void main(String[] args) {
        graph graph = new graph();
        node startNode = graph.getNodes().get(0);

        startNode.heapPermutation(startNode.getEdges(), startNode.getEdges().size(), startNode.getEdges().size());
    }
}
