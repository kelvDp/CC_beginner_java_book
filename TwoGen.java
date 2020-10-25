public class TwoGen {
    public static void main(String[] args) {

        Gen2<Integer, String> tgObj = new Gen2<Integer, String>(88, "Generics");

        tgObj.showType();

        int v = tgObj.getObj1();
        System.out.println("value: " + v);

        String str = tgObj.getObj2();
        System.out.println("value: " + str);
    }
}

// Can have more than one paramaters in a generic type
class Gen2<T, V> {

    T obj1;
    V obj2;

    Gen2(T one, V two) {
        this.obj1 = one;
        this.obj2 = two;
    }

    void showType() {
        System.out.println("Type of T is " + obj1.getClass().getName());
        System.out.println("Type of V is " + obj2.getClass().getName());
    }

    T getObj1() {
        return obj1;
    }

    V getObj2() {
        return obj2;
    }

}