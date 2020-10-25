public class Reverse {

    static void reverse(int index, String msg) {
      if (index != msg.length() - 1) {
          reverse(index + 1, msg);
      }
      System.out.print(msg.charAt(index));
    }
    public static void main(String[] args) {
        String msg = "This is a test";

        reverse(0, msg);
       
    }    
}

