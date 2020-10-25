enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS;
}

public class ToolsDemo {
    public static void main(String[] args) {

        for (Tools t : Tools.values()) {
            System.out.println(t + "'s ordinal value: " + t.ordinal());
        }

    }
}