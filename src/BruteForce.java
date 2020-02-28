import java.util.ArrayList;

public class BruteForce {

    public static void main(String[] args) {
        graph graph = new graph();
        node startNode = graph.getNodes().get(0);
        ArrayList<node> nodes = graph.getNodes();
        nodes.remove(0);

        startNode.heapPermutation(nodes, nodes.size(), nodes.size(), startNode);
    }
}
