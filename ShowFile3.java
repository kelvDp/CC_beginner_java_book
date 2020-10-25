/*
    This version of showFile program uses a try-with-resources
    statement to automatically close a file when it is no longer needed
*/

import java.io.*;

public class ShowFile3 {
    public static void main(String[] args) throws IOException {

        int i;

        // make sure file name has been specified
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // following code uses try-with-resources to open a file
        // and then auto close it when try block is left

        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        }
    }
}
