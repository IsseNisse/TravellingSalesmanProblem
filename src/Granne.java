import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Granne {
    public static void main(String[] args) {
        int totalDistance;

        graph graph = new graph();
        System.out.println(graph.nodes);
        node node = new node(graph.start);

        for (int i = 0; i < graph.node; i++) {
            ArrayList<edge> edges = node.getEdges(node);
            for (int j = 0; j < edges.size(); j++) {
               int minIndex = edges.indexOf(j);
                System.out.println(minIndex);
            }
        }
    }
}
