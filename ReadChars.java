import java.io.*;

public class ReadChars {
    // using a buffered reader to read characters from console
    public static void main(String[] args) throws IOException {

        char ch;

        // create BufferedReader linked to System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters or '.' to quit.");

        // read characters
        do {
            ch = (char) br.read();
            System.out.println(ch);

        } while (ch != '.');
    }
}
