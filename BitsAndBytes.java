class BitsAndBytes {
    public static void main(String[] args) {
        
        // display the bits within a byte
        int t;
        byte val = 125;

        for (t = 128; t > 0; t /= 2) {
            if((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}