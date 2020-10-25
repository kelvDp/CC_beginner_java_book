/*
    Try This 10-1
    Compare two files

    To use this program, specify the names of the files
    to be compared on the command line

    java CompareFiles FIRST.TXT SECOND.TXT
*/

import java.io.*;

public class CompareFiles {
    public static void main(String[] args) throws IOException {

        int i = 0, j = 0;

        if (args.length != 2) {
            System.out.println("Usage: CompareFiles f1 f2");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(args[0]); FileInputStream f2 = new FileInputStream(args[1])) {

            // check the contents of each file
            do {
                i = f1.read();
                j = f2.read();
                if (i != j)
                    break;
            } while (i != -1 && j != -1);

            if (i != j)
                System.out.println("The files differ.");
            else
                System.out.println("The files are the same.");

        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        }
    }
}
