public class UseThreads2 {

    public static void main(String[] args) {
        System.out.println("Main thread is starting.");

        // can create and run thread in one line now
        //  MyThread2 mt = MyThread2.createAndStart("Child #1");

        // OR simply (since it is a static method)
        MyThread2.createAndStart("Child #1");

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

// another version of creating a thread is shown here
// construct an instance of myThread and thread in the same class at the same
// time
class MyThread2 implements Runnable {

    Thread thread;

    MyThread2(String name) {
        thread = new Thread(this, name);
    }

    public static MyThread2 createAndStart(String name) {
        MyThread2 myThread = new MyThread2(name);
        myThread.thread.start();
        return myThread;
    }

    public void run() {

        System.out.println(thread.getName() + " is starting");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(thread.getName() + ", is at count " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " interrupted");
        }

        System.out.println(thread.getName() + " ending.");
    }
}