/*
    Display a text file.
    To use this program, specify the name
    of the file that you want to see.
    For example, to see a file called Test.txt,
    use the following command line:

    java ShowFile Test.txt
*/

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin;

        // First make sure that a file has been specified
        if (args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        try {
            fin = new FileInputStream(args[0]); // this will open the file

        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
            return;
        }

        // now read bytes until End Of File is encountered
        try {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);

            } while (i != -1); // when i = -1 the end of the file has been reached

        } catch (IOException exc) {
            System.out.println("Error reading file");
        }

        try {
            fin.close(); // close the file
        } catch (IOException exc) {
            System.out.println("Error closing file.");
        }
    }
}