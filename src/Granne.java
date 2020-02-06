import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Granne {
    public static void main(String[] args) {
        int totalDistance;
        int total = 0;

        graph graph = new graph();
        node currentNode;

        for (int i = 0; i < graph.getNodes().size(); i++) {
            int shortest = 0;
            currentNode = graph.getNodes().get(i);
            ArrayList<edge> edges = currentNode.getEdges();
            for (int j = 0; j < edges.size(); j++) {
                if (shortest == 0) {
                    shortest = edges.get(j).getWeight();
                } else if (edges.get(j).getWeight() < shortest) {
                    shortest = edges.get(j).getWeight();
                }
            }
            total = total + shortest;
            System.out.println(total);
        }
        System.out.println(total);
    }
}
