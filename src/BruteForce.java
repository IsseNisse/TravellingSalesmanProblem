import java.util.ArrayList;

public class BruteForce {

    public static void main(String[] args) {
        graph graph = new graph();
        node startNode = graph.getNodes().get(0);
        ArrayList<node> nodes = graph.getNodes();
        nodes.remove(0);
        ArrayList<ArrayList<edge>> allPaths = new ArrayList<>();
        int shortestW = 0;

        /*startNode.heapPermutation(nodes, nodes.size(), nodes.size(), startNode);*/
        ArrayList<ArrayList<node>> perms = startNode.heapPermutation(nodes, nodes.size(), nodes.size(), startNode);

        for (int i = 0; i < perms.size(); i++) {
            ArrayList<edge> path = new ArrayList<>();
            for (int j = 0; j < perms.get(j).size(); j++) {
                node node1 = perms.get(j).get(j);
                path.add(startNode.getEdge(node1));
                node node2 = perms.get(j).get(j + 1);
                edge edge = node1.getEdge(node2);
                path.add(edge);

            }

            allPaths.add(path);
        }
        for (int i = 0; i < allPaths.size(); i++) {
            int totalW = 0;
            ArrayList<edge> shortestPath;
            for (int j = 0; j < allPaths.get(j).size(); j++) {
                int w = allPaths.get(j).get(j).getWeight();
                totalW = totalW + w;
            }
            if (shortestW == 0) {
                shortestW = totalW;
                shortestPath = allPaths.get(i);
            } else if (totalW < shortestW) {
                shortestW = totalW;
                shortestPath = allPaths.get(i);
            }
        }
    }
}