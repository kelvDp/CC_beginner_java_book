public class TrafficLightDemo {
    public static void main(String[] args) {

        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thread = new Thread(t1);
        thread.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}

// An enum of the colors of a traffic light.
enum TrafficLightColor {
    RED, GREEN, YELLOW;
}

// A computerized traffic light
class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc; // hold color
    private boolean stop = false; // set to true to stop simulation
    private boolean changed = false; // true when light has changed

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }

    // Change color method

    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }
        changed = true;
        notify(); // signal that light has changed.
    }

    // Wait until light change occurs.
    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait(); // wait for light to change
            }
            changed = false;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Return curr color
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    // Stop traffic light
    synchronized void cancel() {
        stop = true;
    }

    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        Thread.sleep(10000); // green for 10 seconds
                        break;
                    case YELLOW:
                        Thread.sleep(2000); // yellow for 2 seconds
                        break;
                    case RED:
                        Thread.sleep(12000); // red for 12 seconds
                        break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }
}