import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class graph {
    public class granneOOP {
        private int start;
        private int node;
        private int edge;
        private int from;
        private int to;
        private int weight;
        private node fromNode;
        private node toNode;
        private  int position1;
        private  int position2;
        ArrayList<edge> edges = new ArrayList<>();
        ArrayList<node> nodes = new ArrayList<>();

        public granneOOP(int start, int node, int edge) {
            this.start = start;
            this.node = node;
            this.edge = edge;
        }

        public void read() {
            Scanner tgb = new Scanner(System.in);
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
                        node node1 = new node(from);
                        nodes.add(node1);
                    } if (j == to) {
                        position2 = Arrays.asList(nodes).indexOf(j);
                        toNode = nodes.get(position2);
                    } else {
                        node node2 = new node(to);
                        nodes.add(node2);
                    }
                }
                edge edgeTotal = new edge(fromNode, toNode, weight);
                edges.add(edgeTotal);
            }
        }
    }
}
