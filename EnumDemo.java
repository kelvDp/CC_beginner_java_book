public class EnumDemo {
    public static void main(String[] args) {

        // declare a transport reference
        Transport tp;
        // assign tp the constant 'AIRPLANE'
        tp = Transport.AIRPLANE;

        // output an enum value
        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        // compare two enum values
        if (tp == Transport.TRAIN) {
            System.out.println("tp contains TRAIN\n");
        }

        // use enum to controll a switch statement
        switch (tp) {
            case CAR:
                System.out.println("A car carries people.");
                break;
            case TRUCK:
                System.out.println("A truck carries freight.");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;
            default:
                System.out.println("No match.");
                break;
        }
    }
}

// An Enumeration of Transport varieties
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
// these are implicitly public and static final variables