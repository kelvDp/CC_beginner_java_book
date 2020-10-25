import java.io.IOException;

public class Input {
    public static void main(String[] args) throws IOException {

        char ch;

        System.out.println("Press a key followed by ENTER: ");

        ch = (char) System.in.read();

        System.out.println("Your key was: " + ch);
    }
}

// to accept user / keyboard input in java :
// System.in.read() -- this will only read the keyboard key that you press
// and save it as an int that needs to be converted into a char
// also have to hit the enter key to send data to console.
// seems like you can only do this when class throws IOException.
