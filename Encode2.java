public class Encode2 {
    public static void main(String[] args) {

        String msg = "Here is another string";
        String encmsg = "";
        String decmsg = "";
        String key = "monkFood";
        int keyVal = 0;

        System.out.print("Original message: ");
        System.out.println(msg);

        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(keyVal));
            keyVal++;
            if (keyVal == 8) {
                keyVal = 0;
            }
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        keyVal = 0;
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(keyVal));
            keyVal++;
            if (keyVal == 8) {
                keyVal = 0;
            }
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
