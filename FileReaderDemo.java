import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

        String str;

        // create a FileReader wrapped in a BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        }
    }
}
