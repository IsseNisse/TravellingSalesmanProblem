import java.util.ArrayList;

public class Granne {
    public static void main(String[] args) {
        int totalDistance;
        int total = 0;
        ArrayList<node> chosenOnes = new ArrayList<>();

        graph graph = new graph();
        node currentNode;
        node firstNode = graph.getNodes().get(0);
        currentNode = graph.getNodes().get(0);

        for (int i = 0; i < graph.getNodes().size(); i++) {
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
            System.out.println(total);
        }
        System.out.println(total);
    }
}
