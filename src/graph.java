import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class graph {
    protected int start;
    protected int node;
    private int edge;
    private int from;
    private int to;
    private int weight;
    ArrayList<edge> edges = new ArrayList<>();
    ArrayList<node> nodes = new ArrayList<>();

    /**
     * Function to call for and make a new graph
     */
    public graph() {
        read();
    }

    /**
     * A read file that reads the txt file with information and adds the numbers to their right place
     */
    public void read() {
        Scanner tgb = null;
        try {
            // Graph 1 is the graph from the example in my scientific report
            // Graph 2 is a graph of the 10 largest cities in Sweden
            // Graph 3 is a smaller made up graph
            // Graph 4 is a graph of the 19 most visited countries of 2019
            // Graph 5 is the same as graph 4 but is reduced to only 11 nodes/most visited countries
            tgb = new Scanner(new File("graph4.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert tgb != null;
        start = tgb.nextInt();
        node = tgb.nextInt();
        edge = tgb.nextInt();

        for (int i = 0; i < edge; i++) {
            node fromNode = null;
            node toNode = null;
            from = tgb.nextInt();
            if (tgb.hasNext()) {
                to = tgb.nextInt();
                weight = tgb.nextInt();
            }
            for (int j = 0; j < nodes.size(); j++) {
                if (nodes.get(j).getNode1() == from) {
                    fromNode = nodes.get(j);

                }
                if (nodes.get(j).getNode1() == to) {
                    toNode = nodes.get(j);
                }
            }
            if (fromNode == null) {
                fromNode = new node(from);
                nodes.add(fromNode);
            }
            if (toNode == null) {
                toNode = new node(to);
                nodes.add(toNode);
            }
            edge edgeTotal = new edge(fromNode, toNode, weight);
            edges.add(edgeTotal);
            fromNode.addedge(edgeTotal);
            toNode.addedge(edgeTotal);
        }
    }

    /**
     * Get the arrayList that contains all the nodes
     * @return the arrayList
     */
    public ArrayList<node> getNodes() {
        return nodes;
    }

}
