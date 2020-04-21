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
        long startTime = System.nanoTime();
        for (int i = 0; i < graph.getNodes().size() -1; i++) {
            int shortest = 0;
            edge chosen = null;
            ArrayList<edge> edges = currentNode.getEdges();

            chosen = currentNode.getNeighbour(chosenOnes, shortest, currentNode);
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
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(total);
        System.out.println("Execution time in nanoseconds  : " + timeElapsed);

        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);
    }
}
