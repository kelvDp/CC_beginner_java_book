public class QDemo2 {
    public static void main(String[] args) {

        // 10 element empty QueueConstruct
        QueueConstruct q1 = new QueueConstruct(10);

        // QueueConstruct from array
        char[] name = { 'T', 'O', 'M' };
        QueueConstruct q2 = new QueueConstruct(name);

        char ch;
        int i;

        // insert chars into q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // QueueConstruct from another QueueConstruct
        QueueConstruct q3 = new QueueConstruct(q1);

        // show QueueConstructs
        System.out.print("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println();

        System.out.print("Contents of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println();

        System.out.print("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }

    }
}

class QueueConstruct {

    private char[] QueueConstruct;
    private int getLoc, putLoc;

    QueueConstruct(int size) {
        QueueConstruct = new char[size];
        getLoc = putLoc = 0;
    }

    // constructing a QueueConstruct from a QueueConstruct
    QueueConstruct(QueueConstruct obj) {
        putLoc = obj.putLoc;
        getLoc = obj.getLoc;
        QueueConstruct = new char[obj.QueueConstruct.length];

        // copy elements over
        for (int i = getLoc; i < putLoc; i++) {
            QueueConstruct[i] = obj.QueueConstruct[i];
        }
    }

    // construct a QueueConstruct with initial values
    QueueConstruct(char a[]) {
        putLoc = 0;
        getLoc = 0;
        QueueConstruct = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    public void put(char ch) {
        if (putLoc == QueueConstruct.length) {
            System.out.println("-- QueueConstruct is full");
            return;
        }
        QueueConstruct[putLoc++] = ch;
    }

    public char get() {
        if (getLoc == putLoc) {
            System.out.println("-- QueueConstruct is empty");
            return (char) 0;
        }
        return QueueConstruct[getLoc++];
    }
}