import java.io.*;

public class Exercise10 {
    public static void main(String[] args) {

        int i;
        FileInputStream file1 = null;
        FileOutputStream file2 = null;

        if (args.length != 2) {
            System.out.println("Usage: Exercise10 f1 f2");
            return;
        }

        try {
            file1 = new FileInputStream(args[0]);
            file2 = new FileOutputStream(args[1]);

            do {
                i = file1.read();

                if (i == ' ') {
                    i = '-';
                }

                if (i != -1) {
                    file2.write(i);
                }

            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O error : " + exc);
            
        } finally {
            try {
                if (file1 != null) {
                    file1.close();
                }
            } catch (IOException exc) {
                System.out.println("Error closing input file.");
            }

            try {
                if (file2 != null) {
                    file2.close();
                }
            } catch (IOException exc) {
                System.out.println("Error closing output file.");
            }
        }
    }
}
