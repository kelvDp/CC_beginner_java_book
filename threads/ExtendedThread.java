package threads;

public class ExtendedThread {
    public static void main(String[] args) {

        System.out.println("Main thread starting.");

        MyThread mt = new MyThread("Child #2");

        mt.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");

            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}

// Here is another way of creating threads
// instead of implementing the Runnable interface
// you extends the Thread superclass

class MyThread extends Thread {

    MyThread(String name) {
        super(name); // thread name
    }

    // entry point of thread
    public void run() {

        // because this class extends Thread, can call all its static methods i.e
        // getName()
        // without having to reference an obj
        System.out.println(getName() + " starting.");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " ending.");
    }
}