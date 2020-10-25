package ticktok;

public class ThreadCom {
    public static void main(String[] args) {
        
        TickTok tt = new TickTok();
        MyThread mt1 = MyThread.createAndStart("Tick", tt);
        MyThread mt2 = MyThread.createAndStart("Tock", tt);

        try {
            mt1.thread.join();
            mt2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted.");
        }
    }
}
