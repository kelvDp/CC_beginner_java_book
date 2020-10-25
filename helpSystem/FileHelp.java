package helpSystem;

/*
    Try This 10-2

    A help program that uses a disk file
    to store help information

*/

import java.io.*;

// The help class opens a help file,
// searches for a topic, and then displays the information
// associated with that topic.

public class FileHelp {
    public static void main(String[] args) throws IOException {

        Help helpObj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. Enter 'stop' to end.");

        do {
            topic = helpObj.getSelection();

            if (!helpObj.helpOn(topic)) {
                System.out.println("Topic not found. \n");
            }

        } while (topic.compareTo("stop") != 0);
    }
}
