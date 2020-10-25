public class UseThreads {
    public static void main(String[] args) {

        System.out.println("Main thread starting");

        // First, construct a myThread object
        MyThread mThread = new MyThread("Child #1");

        // Secondly, construct a thread from that object
        Thread thread = new Thread(mThread);

        // Finally, start execution of the thread
        thread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");

            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread ending.");
    }
}

// Create a thread by implementing Runnable(which is an interface)

// Objects of MyThread can be run in their own threads because MyThread
// Implements Runnable
class MyThread implements Runnable {

    String threadName;

    MyThread(String name) {
        this.threadName = name;
    }

    // Entry point of thread.
    // thread starts executing here
    public void run() {

        System.out.println(threadName + " starting.");

        try {

            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is " + count);
            }

        } catch (InterruptedException exc) {
            System.out.println(threadName + " interrupted.");
        }

        System.out.println(threadName + " terminating.");
    }

}