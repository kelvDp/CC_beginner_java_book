public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MThread2 mt1 = MThread2.createAndStart("Child #1");
        MThread2 mt2 = MThread2.createAndStart("Child #2");
        MThread2 mt3 = MThread2.createAndStart("Child #3");

        // using join() to ensure main is last thread to stop
        // these threads only join once they are finished,
        // and main can only end once all of them have joined
        try {

            mt1.thread.join();
            System.out.println("Child #1 joined");
            mt2.thread.join();
            System.out.println("Child #2 joined");
            mt3.thread.join();
            System.out.println("Child #3 joined");

        } catch (InterruptedException exc) {
            System.out.println("Main interrupted.");
        }

        System.out.println("Main ending.");
    }
}

class MThread2 implements Runnable {

    Thread thread;

    // construct a new thread
    MThread2(String name) {
        thread = new Thread(this, name);
    }

    public static MThread2 createAndStart(String name) {
        MThread2 myT = new MThread2(name);
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