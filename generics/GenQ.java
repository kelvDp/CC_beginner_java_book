package generics;

// A generic fixed-size Queue class
public class GenQ<T> implements IGenQ<T> {

    private T[] q; // this will hold the queue
    private int putloc, getloc; // put and get indices

    GenQ(T[] aRef) {
        this.q = aRef;
        putloc = getloc = 0;
    }

    // Put an item into the Q
    public void put(T obj) throws QfullExc {

        if (putloc == q.length) {
            throw new QfullExc(q.length);
        }

        q[putloc++] = obj;
    }

    // Get a char from the Q
    public T get() throws QemptyExc {

        if (getloc == putloc) {
            throw new QemptyExc();
        }

        return q[getloc++];
    }
}
