public class MultiThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // create and start executing three threads
        // MThread.createAndStart("Child #1");
        // MThread.createAndStart("Child #2");
        // MThread.createAndStart("Child #3");

        MThread mt1 = MThread.createAndStart("Child #1");
        MThread mt2 = MThread.createAndStart("Child #2");
        MThread mt3 = MThread.createAndStart("Child #3");

        // for (int i = 0; i < 50; i++) {
        // System.out.print(".");
        // try {
        // Thread.sleep(100);
        // } catch (InterruptedException exc) {
        // System.out.println("Main thread interrupted.");
        // }
        // }

        // using isAlive() to determine whether a thread is active or not

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main interrupted");
            }
            // this will wait until all threads terminate
        } while (mt1.thread.isAlive() || mt2.thread.isAlive() || mt3.thread.isAlive());

        System.out.println("Main ending.");
    }
}

// you can create multiple threads

class MThread implements Runnable {

    Thread thread;

    // construct a new thread
    MThread(String name) {
        thread = new Thread(this, name);
    }

    // method that creates and starts a thread
    // public static void createAndStart(String name) {
    // MThread myT = new MThread(name);
    // myT.thread.start();
    // }

    public static MThread createAndStart(String name) {
        MThread myT = new MThread(name);
        myT.thread.start();
        return myT;
    }

    public void run() {
        System.out.println(thread.getName() + " starting.");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(thread.getName() + ", is count " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " interrupted.");
        }

        System.out.println(thread.getName() + " ending.");
    }

}