package qExceptions;

public class FixedQ {

    private char[] q;
    private int getloc, putloc;

    FixedQ(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QfullException {

        if (putloc == q.length) {
            throw new QfullException(q.length);
        }
        q[putloc++] = ch;
    }

    public char get() throws QemptyException {

        if (getloc == putloc) {
            throw new QemptyException();
        }
        return q[getloc++];
    }
}
