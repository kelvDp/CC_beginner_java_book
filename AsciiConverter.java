import java.io.IOException;

public class AsciiConverter {
    public static void main(String args[]) throws IOException {

        char ch, ignore;
        int caseChanges = 0;

        do {
            System.out.println("Enter a char or '.' to exit: ");
            ch = (char) System.in.read();

            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                caseChanges++;
                System.out.println(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                caseChanges++;
                System.out.println(ch);
            } else {
                System.out.println(ch);
            }

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (ch != '.');

        System.out.println("There were " + caseChanges + " case conversions done.");

    }
}
