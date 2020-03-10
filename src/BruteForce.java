import java.util.ArrayList;

public class BruteForce {

    public static void main(String[] args) {
        graph graph = new graph();
        node startNode = graph.getNodes().get(0);
        ArrayList<node> nodes = graph.getNodes();
        nodes.remove(0);

        /*startNode.heapPermutation(nodes, nodes.size(), nodes.size(), startNode);*/
        ArrayList<ArrayList<node>> perms = startNode.heapPermutation(nodes, nodes.size(), nodes.size(), startNode);

        for (int i = 0; i < perms.size(); i++) {
            for (int j = 0; j < perms.get(j).size(); j++) {
                node node1 = perms.get(j).get(j);
                node node2 = perms.get(j).get(j + 1);
                System.out.println("hej");
            }
        }
    }
}