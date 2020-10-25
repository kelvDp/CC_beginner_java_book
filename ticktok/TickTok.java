package ticktok;

public class TickTok {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {

        if (!running) {
            // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interruption");
        }

        System.out.print("Tick ");
        state = "ticked"; // set curr state to ticked
        notify(); // let tock() run -- tick() notifies tock()

        try {
            while (!state.equals("tocked")) {
                wait(); // wait for tock() to complete
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {

        if (!running) {
            state = "tocked";
            notify();
            return;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interruption");
        }

        System.out.print("Tock ");
        state = "tocked";
        notify();

        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }
}
