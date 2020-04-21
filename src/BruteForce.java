import java.util.ArrayList;

public class BruteForce {

    public static void main(String[] args) {
        graph graph = new graph();
        node startNode = graph.getNodes().get(0);
        ArrayList<node> nodes = graph.getNodes();
        ArrayList<node> nodesCopy = new ArrayList<>(nodes);
        nodesCopy.remove(0);
        ArrayList<ArrayList<edge>> allPaths = new ArrayList<>();
        int shortestW = 0;
        ArrayList<edge> shortestPath = null;

        /*startNode.heapPermutation(nodes, nodes.size(), nodes.size(), startNode);*/
        long startTime = System.nanoTime();
        ArrayList<ArrayList<node>> perms = startNode.heapPermutation(nodesCopy, nodesCopy.size(), nodesCopy.size(), startNode);

        for (int i = 0; i < perms.size(); i++) {
            ArrayList<edge> path = new ArrayList<>();
            path.add(0, startNode.getEdge(perms.get(i).get(0)));
            node node1 = null;
            node node2 = null;
            for (int j = 0; j < perms.get(i).size() -1; j++) {
                if (node1 == null) {
                    node1 = perms.get(i).get(j);
                } else {
                    node1 = path.get(j).getNode2();
                }
                node2 = perms.get(i).get(j + 1);
                if (node2.getEdge(node1) == null) {
                    System.out.println(i);
                    System.out.println(j);
                }
                edge edge = node2.getEdge(node1);
                    if (edge.getNode1() != path.get(j).getNode2()) {
                        edge = new edge(node1, node2, edge.getWeight());
                    }
                path.add(edge);

            }
            node last = perms.get(i).get(perms.get(i).size() -1);

            edge lastEdge = last.getEdge(startNode);
            if (lastEdge.getNode1() != path.get(path.size() -1).getNode2()) {
                lastEdge = new edge(last, startNode, lastEdge.getWeight());
            }
            path.add(lastEdge);
            allPaths.add(path);
        }
        for (int i = 0; i < allPaths.size(); i++) {
            int totalW = 0;

            for (int j = 0; j < allPaths.get(i).size(); j++) {
                int w = allPaths.get(i).get(j).getWeight();
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
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println(shortestPath);
        System.out.println(shortestW);

        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

    }
}