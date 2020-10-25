package interfaces;

public class IQDemo {
    public static void main(String[] args) {
        // this method will use the ICHarQ to reference all three Q's
        FixedQueue q1 = new FixedQueue(10);
        DynQ q2 = new DynQ(5);
        CircularQueue q3 = new CircularQueue(10);

        // here is the interface reference
        ICharQ iQ;

        char ch;
        int i;

        // put some chars into fixedQ
        iQ = q1;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        // show fixedQ
        System.out.print("Contents of fixed Queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // put chars into dynamic Q
        iQ = q2;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }

        // show dynQ
        System.out.print("Contents of DynQ: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // put chars into circQ
        iQ = q3;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('a' + i));
        }

        // get items from cQ
        System.out.print("Contents of CircularQ: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // more chars into cQ
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
        } // will cause Q to get full since getloc does'nt increment

        // show Q again
        System.out.print("Further contents of circular Q: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nStore and consume from circular Queue.");

        // store in and consume from circular Q
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

    }
}

// a fixed size queue class for characters
class FixedQueue implements ICharQ {

    private char[] q; // to hold queue
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println("-- Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    public char get() {
        if (putloc == getloc) {
            System.out.println(" -- Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class CircularQueue implements ICharQ {

    private char[] c;
    private int getloc, putloc;

    public CircularQueue(int size) {
        c = new char[size + 1];
        getloc = putloc = 0;
    }

    // put a char into the Q
    public void put(char ch) {

        /*
         * Q is full if either the putloc is one less than getloc , or if putloc is at
         * the end of the array and getloc is at the beginning.
         */

        if (putloc + 1 == getloc | ((putloc == c.length - 1) & (getloc == 0))) {
            System.out.println("--Queue is full");
            return;
        }
        c[putloc++] = ch;
        if (putloc == c.length)
            putloc = 0; // loop back
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("--Queue is empty");
            return (char) 0;
        }
        char ch = c[getloc++];
        if (getloc == c.length)
            getloc = 0; // loop back
        return ch;
    }
}

// Dynamic Q to expand size when full
class DynQ implements ICharQ {

    private char[] d;
    private int getloc, putloc;

    public DynQ(int size) {
        d = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == d.length) {
            // increase Q size by creating new bigger one
            char[] t = new char[d.length * 2];

            // copy elements over
            for (int i = 0; i < d.length; i++) {
                t[i] = d[i];
            }
            d = t;
        }
        d[putloc++] = ch;
    }

    public char get() {

        if (getloc == putloc) {
            System.out.println("--  Queue is empty");
            return (char) 0;
        }
        return d[getloc++];
    }
}