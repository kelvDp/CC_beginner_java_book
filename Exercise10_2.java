import java.io.*;

public class Exercise10_2 {
    public static void main(String[] args) {

        int i;

        if (args.length != 2) {
            System.out.println("Usage: Exercise10_2 f1 f2");
            return;
        }

        try (FileReader fr = new FileReader(args[0]); FileWriter fw = new FileWriter(args[1])) {

            do {
                i = fr.read();
                if (i == ' ')
                    i = '-';
                if (i != -1)
                    fw.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        }
    }
}
