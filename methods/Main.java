package methods;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        
        char ch, ignore;
        HelpObj help = new HelpObj();

        System.out.println("Choose a char or enter 'q' to exit:");
        do {
            help.showMenu();
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while ( ignore != '\n');
            
            if (help.isValid(ch)) {
                help.helpOn(ch);
            }

        } while (ch != 'q');
    }
}
