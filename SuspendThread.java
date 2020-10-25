public class SuspendThread {
    public static void main(String[] args) {

        AnotherThread mt1 = AnotherThread.createAndStart("Child #1");

        try {
            Thread.sleep(1000); // let ob1 thread start executing

            mt1.mySuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            mt1.myResume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            mt1.mySuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            mt1.myResume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            mt1.mySuspend();
            System.out.println("Stopping thread");
            mt1.myStop();

        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        // wait for thread to finish
        try {
            mt1.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}

// Suspending, stopping and resuming a thread
class AnotherThread implements Runnable {

    Thread thread;
    boolean suspended;
    boolean stopped;

    AnotherThread(String name) {
        thread = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static AnotherThread createAndStart(String name) {

        AnotherThread myT = new AnotherThread(name);
        myT.thread.start();
        return myT;
    }

    public void run() {

        System.out.println(thread.getName() + " starting");

        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");

                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // use sync block to check suspended and stopped
                synchronized (this) {

                    while (suspended) {
                        wait();
                    }

                    if (stopped)
                        break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted.");
        }

        System.out.println(thread.getName() + " exiting.");
    }

    // stop the thread
    synchronized void myStop() {
        stopped = true;

        // following ensures a suspended thread can be stopped as well
        suspended = false;
        notify();
    }

    // Suspend the thread
    synchronized void mySuspend() {
        suspended = true;
    }

    synchronized void myResume() {
        suspended = false;
        notify();
    }
}