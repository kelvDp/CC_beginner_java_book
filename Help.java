import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException{
        
        System.out.println("Help on: ");
        System.out.println("\t1.if");
        System.out.println("\t2.switch");
        System.out.println("Choose one: ");
        
        char choice = (char) System.in.read();

        switch(choice) {
            case '1':
                System.out.println("The if:");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:");
                System.out.println("switch (condition) {");
                System.out.println("\tcase constant:");
                System.out.println("\t\tstatement sewuence:");
                System.out.println("\t\tbreak;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found");
        }

    }
}
