import java.util.ArrayList;
import java.util.Scanner;

public class graph {
    public class granneOOP {
        private int start;
        private int node;
        private int edge;
        private int from;
        private int to;
        private int weight;
        private int fromNode;
        private int toNode;
        ArrayList<edge> edges = new ArrayList<>();
        ArrayList<Integer> nodes = new ArrayList<>();

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

                }
                if (nodes.contains()) {

                }
            }
        }
    }
}
