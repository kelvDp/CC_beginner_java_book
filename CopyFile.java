/*
    Copy a text file.
    To use this program, specify the name of the source file
    and the destination file.
    For example, to copy a file called FIRST.TXT
    to a file called SECOND.TXT, use the following in the
    comman line:

    java CopyFile FIRST.TXT SECOND.TXT
*/

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // first make sure that both files have been specified
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
        }

        // now copy a file
        try {
            // attemp to open the files
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1)
                    fout.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing Input file");
            }

            try {
                if (fout != null)
                    fout.close();
            } catch (IOException exc) {
                System.out.println("Error clsoing output file.");
            }
        }
    }
}
