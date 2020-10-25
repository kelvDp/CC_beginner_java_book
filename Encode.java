public class Encode {
    public static void main(String[] args) {
        
        String msg = "This is a test";
        String encodedMsg = "";
        String decodedMsg = "";
        int key = 88;

        System.out.print("Here is the original message: ");
        System.out.println(msg);

        // encode the msg
        for (int i = 0; i < msg.length(); i++) {
            encodedMsg = encodedMsg + (char) (msg.charAt(i) ^ key);
        }

        System.out.print("Encoded message: ");
        System.out.println(encodedMsg);

        // decode the message
        for (int i = 0; i < msg.length(); i++) {
            decodedMsg = decodedMsg + (char) (encodedMsg.charAt(i) ^ key);
        }

        System.out.print("Decoded message: ");
        System.out.println(decodedMsg);
    }
}
