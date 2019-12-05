import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Granne {
    public static void main(String[] args) {

        // Read a file with information
        Scanner src = null;
        try {
            src  = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int nod = src.nextInt();
        int kanter = src.nextInt();

        for (int i = 0; i < kanter; i++) {
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
