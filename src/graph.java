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
    private node fromNode;
    private node toNode;
    private int position1;
    private int position2;
    private node node1;
    private node node2;
    ArrayList<edge> edges = new ArrayList<>();
    ArrayList<node> nodes = new ArrayList<>();

    /**
     * Constructor to create a new graph
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
            tgb = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        start = tgb.nextInt();
        node = tgb.nextInt();
        edge = tgb.nextInt();

        for (int i = 0; i < 3; i++) {

        }

        for (int i = 0; i < edge; i++) {
            from = tgb.nextInt();
            if (tgb.hasNext()) {
                to = tgb.nextInt();
                weight = tgb.nextInt();
            }
            for (int j = 0; j < nodes.size(); j++) {
                if (j == from) {
                    position1 = Arrays.asList(nodes).indexOf(j);
                    fromNode = nodes.get(position1);
                } else {
                    node1 = new node(from);
                    nodes.add(node1);
                }
                if (j == to) {
                    position2 = Arrays.asList(nodes).indexOf(j);
                    toNode = nodes.get(position2);
                } else {
                    node2 = new node(to);
                    nodes.add(node2);
                }
            }
            edge edgeTotal = new edge(fromNode, toNode, weight);
            edges.add(edgeTotal);
            node1.addedge(edgeTotal);
            node2.addedge(edgeTotal);
        }
    }

    public int getStart() {
        return start;
    }
}
