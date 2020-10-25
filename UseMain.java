/*
    Try-This 11-2

    Controlling the main thread

*/

public class UseMain {

    public static void main(String[] args) {

        Thread thread;

        // get the main thread
        thread = Thread.currentThread(); // returns a reference to this thread

        // display main thread name
        System.out.println("Main thread is called " + thread.getName());

        // display priority
        System.out.println("Priority: " + thread.getPriority());

        System.out.println();

        // set the name and priority
        System.out.println("Setting name and priority.\n");
        thread.setName("Thread #1");
        thread.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("Main thread is now called " + thread.getName());
        System.out.println("Priority is now: " + thread.getPriority());

        // never try to join() the main thread, because it will never end i.e be stuck
        // in infinite loop
    }
}
