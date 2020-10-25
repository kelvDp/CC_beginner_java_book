public class ThreadSync {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5 };

        MyTh mt1 = MyTh.createAndStart("Child #1", a);
        MyTh mt2 = MyTh.createAndStart("Child #2", a);

        try {
            mt1.thread.join();
            mt2.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main interrupted");
        }

    }
}

// Using sunc to controll access to a method by a thread
class SumArray {

    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0; // reset sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try {
                Thread.sleep(10); // allow task-switch
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted");
            }
        }

        return sum;
    }
}

// here is another way to sync calls to sumarray if you can't sync the method 
class SumArray2 {

    private int sum;

    // see that method is not synced
    int sumArray(int[] nums) {
        sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try {
                Thread.sleep(10); // allow task-switch
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted");
            }
        }

        return sum;
    }
}

class MyTh implements Runnable {

    Thread thread;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    // construct a new thread
    MyTh(String name, int[] nums) {
        thread = new Thread(this, name);
        a = nums;
    }

    // Factory method that creates and starts a thread
    public static MyTh createAndStart(String name, int[] nums) {
        MyTh myThread = new MyTh(name, nums);
        myThread.thread.start();
        return myThread;
    }

    public void run() {

        System.out.println(thread.getName() + " starting.");

        // * see SumArray2
        // sync calls to sumArray since method is not declared as sync

        // synchronized(sa) {
        //     answer = sa.sumArray(a);
        // }   -- this will also sync calls to the method

        answer = sa.sumArray(a);
        System.out.println("Sum for " + thread.getName() + " is " + answer);

        System.out.println(thread.getName() + " terminating.");
    }
}