enum LightColors {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    LightColors(int d) {
        delay = d;
    }

    int getDelay() {
        return delay;
    }

}

class Simulator implements Runnable {
    private LightColors tlc;
    private boolean stop = false;
    private boolean changed = false;

    Simulator(LightColors init) {
        tlc = init;
    }

    Simulator() {
        tlc = LightColors.RED;
    }

    public void run() {
        while (!stop) {

            try {
                Thread.sleep(tlc.getDelay());
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }

            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = LightColors.GREEN;
                break;
            case YELLOW:
                tlc = LightColors.RED;
                break;
            case GREEN:
                tlc = LightColors.YELLOW;
        }

        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed)
                wait();
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    synchronized LightColors getColor() {
        return tlc;
    }

    synchronized void cancel() {
        stop = true;
    }
}

class TrafficLightV2 {
    public static void main(String args[]) {
        Simulator tl = new Simulator(LightColors.GREEN);

        Thread thrd = new Thread(tl);
        thrd.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }

        tl.cancel();
    }
}
