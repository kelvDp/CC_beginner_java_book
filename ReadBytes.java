import java.io.*;

public class ReadBytes {
    public static void main(String[] args) throws IOException {

        // read an array of bytes from the keyboard

        // use byte cause main i/O stream deals with bytes
        byte[] data = new byte[10];

        System.out.println("Enter some characters.");
        System.in.read(data); // this will write the input from the keyboard to the data array

        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) (data[i]));
        }
    }
}