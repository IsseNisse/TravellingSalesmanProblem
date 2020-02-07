import java.util.ArrayList;

public class Granne {
    public static void main(String[] args) {
        int totalDistance;
        int total = 0;
        ArrayList<edge> chosenOnes = new ArrayList<>();

        graph graph = new graph();
        node currentNode;

        for (int i = 0; i < graph.getNodes().size(); i++) {
            int shortest = 0;
            edge chosen = null;
            currentNode = graph.getNodes().get(i);
            ArrayList<edge> edges = currentNode.getEdges();
            for (int j = 0; j < edges.size(); j++) {
                if (!chosenOnes.contains(edges.get(j))) {
                    if (shortest == 0) {
                        shortest = edges.get(j).getWeight();
                    } else if (edges.get(j).getWeight() < shortest) {
                        chosen = edges.get(j);
                        shortest = edges.get(j).getWeight();
                    }
                }
            }
            chosenOnes.add(chosen);
            total = total + shortest;
            System.out.println(total);
        }
        System.out.println(total);
    }
}
