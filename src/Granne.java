import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Granne {
    public static void main(String[] args) {

        int nod = 0;
        Scanner src = null;
        try {
            src  = new Scanner(new File("text.txt"));
            nod = src.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(nod);
    }
}
