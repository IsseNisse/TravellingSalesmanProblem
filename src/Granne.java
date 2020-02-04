import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Granne {
    public static void main(String[] args) {
        int totalDistance;
        int shortest = 0;
        int total = 0;

        graph graph = new graph();
        node currentNode = new node(graph.start);

        for (int i = 0; i < graph.getNodes().size(); i++) {
            ArrayList<edge> edges = currentNode.getEdges();
            for (int j = 0; j < edges.size(); j++) {
                if (shortest == 0) {
                    shortest = edges.get(j).getWeight();
                } else if (edges.get(j).getWeight() < shortest) {
                    shortest = edges.get(j).getWeight();
                }
            }
            total = total + shortest;
        }
        System.out.println(total);
    }
}
