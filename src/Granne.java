import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Granne {
    public static void main(String[] args) {

        /**
         * A try catch to read the file with information about the conditions
         */
        Scanner src = null;
        try {
            src = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * Gets the number of nodes in the chosen graph
         * Gets the number of edges in the chosen graph
         */
        int start = src.nextInt();
        int nodes = src.nextInt();
        int edges = src.nextInt();

        /**
         * For loop to go get the distances between the nodes and variables to keep track of the different numbers
         */
        ArrayList<Integer> pos1 = new ArrayList<Integer>();
        ArrayList<Integer> pos2 = new ArrayList<Integer>();
        ArrayList<Integer> length = new ArrayList<Integer>();
        for (int i = 0; i < edges; i++) {
            pos1.add(src.nextInt());
            if (src.hasNext()) {
                pos2.add(src.nextInt());
                length.add(src.nextInt());
            }
            System.out.println(pos1 + " " + pos2 + " " + length);
        }

        while (pos1.equals(start)) {

        }
        System.out.println(pos1 + " " + pos2 + " " + length);
    }
}
