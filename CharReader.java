import java.io.IOException;

public class CharReader {
    public static void main(String[] args) throws IOException{
        char ch, ignore;
        int spaces = 0;

        do {
            System.out.println("Enter a space or '.' to exit:");
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (ch != '.');

        System.out.println("The number of spaces typed: " + spaces);
    }
}
