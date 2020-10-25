import java.io.IOException;

public class GuessingGame {
    public static void main(String[] args) throws IOException {

        // game with nested if/else statements
        char ch;
        char answer = 'K';
        char ignore;

        // System.out.println("I'm thinking of a letter between A and Z.");
        // System.out.print("Can you guess it: ");

        // ch = (char) System.in.read();

        // if (ch == answer) System.out.println("***Right***");
        // else {
        // System.out.print("...Sorry, you're ");
        // if (ch < answer) System.out.println("too low");
        // else System.out.println("too high");

        // using a do-while loop to run game until right answer if found
        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");
            ch = (char) System.in.read();

            // can nest do-while loops as well
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer)
                System.out.println("**Right**");
            else {
                System.out.print("...sorry, you're ");
                if (ch < answer)
                    System.out.println("too low");
                else
                    System.out.println("too high");
                System.out.println("Try again!\n");
            }
        } while (answer != ch);
    }
}
