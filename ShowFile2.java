/*
    this variation wraps the code tha opens and 
    accessess the file within a single try block.
    The file is then closed by the finally block
*/

import java.io.*;

public class ShowFile2 {
    public static void main(String[] args) {

        int i;
        FileInputStream fin = null; // fin is initialized to null

        // first confirm that a file name has been specified
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
        }

        // following code opens a file, reads until end of file
        // is encountered, and then closes the file via finally block
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);
            } while (i != -1);

        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
        } catch (IOException exc) {
            System.out.println("An I/O exception occured");
        } finally {
            // close file in all cases
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing file");
            }
        }
    }
}
