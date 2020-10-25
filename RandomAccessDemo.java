import java.io.*;

public class RandomAccessDemo {
    // demonstrate a random access file

    public static void main(String[] args) throws IOException {

        double[] data = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        // open and use random access file.
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {

            // write values to file
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // now read back specific values
            raf.seek(0); // seek to first double -- sets file pointer
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); // seek to second value (works in bits i.e 0 = 1 , 8 = 2...)
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(24); // seek to fourth value
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            // now, read every other value
            System.out.println("Here is every other value: ");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8 * i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        }
    }
}
// since each double is 8 bytes long, each value starts on an 8-byte boundary.