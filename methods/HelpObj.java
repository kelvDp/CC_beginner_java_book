package methods;

public class HelpObj {

    void showMenu() {
        System.out.println("Help on: ");
        System.out.println("\t1.if");
        System.out.println("\t2.switch");
        System.out.println("\t3.for");
        System.out.println("\t4.while");
        System.out.println("\t5.do-while");
        System.out.println("\t6.break");
        System.out.println("\t7.continue\n");
        System.out.print("Choose one or enter 'q' to quit: ");
    }

    void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("The if:");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:");
                System.out.println("switch (condition) {");
                System.out.println("\tcase constant:");
                System.out.println("\t\tstatement sequence:");
                System.out.println("\t\tbreak;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.print("for (init; condition; iteration)");
                System.out.println("statement;");
                break;
            case '4':
                System.out.println("The while: \n");
                System.out.println("while (condition) statement;");
                break;
            case '5':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println("\tstatement;");
                System.out.println("} while (condition);");
                break;
            case '6':
                System.out.println("The break:");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("The continue:");
                System.out.println("continue, or continue label;");
                break;
            default:
                System.out.println("Selection not found");
        }
    }

    boolean isValid(char ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }

    // choice=(char)System.in.read();

    // do

    // {
    // ignore = (char) System.in.read();
    // }while(ignore!='\n');

    // if(choice=='q')break;System.out.println();


}
