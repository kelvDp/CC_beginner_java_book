package helpSystem;

import java.io.*;

public class Help {
    String helpfile; // name of help file

    Help(String fileName) {
        this.helpfile = fileName;
    }

    // display help on a topic
    boolean helpOn(String what) {
        int ch;
        String topic, info;

        // open the help file
        try (BufferedReader helpRd = new BufferedReader(new FileReader(helpfile))) {

            do {
                // read chars until # is found
                ch = helpRd.read();

                // now see if topics match
                if (ch == '#') {
                    topic = helpRd.readLine();
                    if (what.compareTo(topic) == 0) {
                        // then found topic
                        do {
                            info = helpRd.readLine();
                            if (info != null)
                                System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException exc) {
            System.out.println("Error accessing help file.");
            return false;
        }
        return false; // topic not found
    }

    // Get a help topic
    String getSelection() {

        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a topic: ");

        try {
            topic = br.readLine();
        } catch (IOException exc) {
            System.out.println("Error reading the console.");
        }

        return topic;
    }
}
