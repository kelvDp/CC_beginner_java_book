package generics;

// Generic Queue interface
public interface IGenQ<T> {

    // Put an item into the Q
    void put(T ch) throws QfullExc;

    // Get an item from the Q
    T get() throws QemptyExc;
    // Notice that the type of data stored by the queue is specified by the generic
    // type parameter T.
}
