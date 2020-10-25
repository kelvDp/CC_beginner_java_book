package ticktok;

public class MyThread implements Runnable {

    Thread thread;
    TickTok ttObj;

    // construct a new thread
    MyThread(String name, TickTok tt) {
        thread = new Thread(this, name);
        ttObj = tt;
    }

    // factory method
    public static MyThread createAndStart(String name, TickTok tt) {

        MyThread mt = new MyThread(name, tt);
        mt.thread.start();
        return mt;
    }

    public void run() {

        if (thread.getName().compareTo("Tick") == 0) {

            for (int i = 0; i < 5; i++) {
                ttObj.tick(true);
            }
            ttObj.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                ttObj.tock(true);
            }
            ttObj.tock(false);
        }
    }
}
