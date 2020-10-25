public class EnumDemo3 {
    public static void main(String[] args) {

        // display speed of airplane
        System.out.println("Typical speed for an airplane is " + Transport3.AIRPLANE.getSpeed() + " miles per hour\n");

        // display all transport speeds
        System.out.println("All Transport speeds: ");
        for (Transport3 t : Transport3.values()) {
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
        }
    }
}

// Use an enum constructor, instance var and method
enum Transport3 {

    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); // this is how you initialize the values

    // instance var
    private int speed; // typical speed of each transport

    // constructor
    Transport3(int speed) {
        this.speed = speed;
    }

    // method
    int getSpeed() {
        return speed;
    }

}