import java.io.*;

public class ReadLines {
    // read a string from the console using a bufferedreader
    public static void main(String[] args) throws IOException {

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to exit.");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
