import java.util.ArrayList;

public class Neighbour {
    public static void main(String[] args) {
        int totalDistance;
        int total = 0;
        ArrayList<node> chosenOnes = new ArrayList<>();

        graph graph = new graph();
        node currentNode;
        node firstNode = graph.getNodes().get(0);
        currentNode = graph.getNodes().get(0);

        for (int i = 0; i < graph.getNodes().size() -1; i++) {
            int shortest = 0;
            edge chosen = null;
            ArrayList<edge> edges = currentNode.getEdges();

            chosen = currentNode.getNeighbour(chosenOnes, shortest, currentNode, firstNode);
            chosenOnes.add(currentNode);
            int shortest2 = chosen.getWeight();
            if (currentNode == chosen.getNode1()) {
                currentNode = chosen.getNode2();
            } else {
                currentNode = chosen.getNode1();
            }

            total = total + shortest2;
        }
        edge last = currentNode.getEdges().get(0);
        int lastWeight = last.getWeight();
        total = total + lastWeight;
        System.out.println(total);
    }
}
