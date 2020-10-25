public class ThreadPriority {
    public static void main(String[] args) {

        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");
        Priority mt3 = new Priority("Normal Priority #1");
        Priority mt4 = new Priority("Normal Priority #2");
        Priority mt5 = new Priority("Normal Priority #3");

        // set the priorities
        mt1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thread.setPriority(Thread.NORM_PRIORITY - 2);
        // leave the rest as normal priority

        // start the threads
        mt1.thread.start();
        mt2.thread.start();
        mt3.thread.start();
        mt4.thread.start();
        mt5.thread.start();

        try {
            mt1.thread.join();
            mt2.thread.join();
            mt3.thread.join();
            mt4.thread.join();
            mt5.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main interrupted");
        }

        System.out.println("\nHigh Priority thread counted to " + mt1.count);
        System.out.println("Low Priority thread counted to " + mt2.count);
        System.out.println("1st Normal Priority thread counted to " + mt3.count);
        System.out.println("2nd Normal Priority thread counted to " + mt4.count);
        System.out.println("3rd Normal Priority thread counted to " + mt5.count);
    }
}

// Demonstrate Thread priorities
class Priority implements Runnable {

    int count;
    Thread thread;

    static boolean stop = false;
    static String currName;

    // construct a new thread
    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currName = name;
    }

    // Entry poin of thread
    public void run() {

        System.out.println(thread.getName() + " starting");

        do {
            count++;
            if (currName.compareTo(thread.getName()) != 0) {
                currName = thread.getName();
                System.out.println("In " + currName);
            }
        } while (stop == false && count < 10000000);

        stop = true;

        System.out.println("\n" + thread.getName() + " terminating.");
    }
}