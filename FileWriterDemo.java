// A simple key to disk utility that demonstrates a FileWriter

import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text ('stop' to quit).");

        // create a FileWriter
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n"; // add new line
                fw.write(str);

            } while (str.compareTo("stop") != 0);

        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        }
    }
}