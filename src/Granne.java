import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Granne {
    public static void main(String[] args) {

        /**
         * A try catch to read the file with information about the conditions
         */
        Scanner src = null;
        try {
            src  = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * Gets the number of nodes in the chosen graph
         * Gets the number of edges in the chosen graph
         */
        int nodes = src.nextInt();
        int edges = src.nextInt();

        /**
         * For loop to go get the distances between the nodes
         */
        for (int i = 0; i < edges; i++) {
            int pos = src.nextInt();
            int pos2 = 0;
            int pos3 = 0;
            if (src.hasNext()) {
                pos2 = src.nextInt();
                pos3 = src.nextInt();
            }
            System.out.println(pos + " " + pos2 + " " + pos3);
        }
    }
}
