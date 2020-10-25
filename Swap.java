public class Swap {
    public static void main(String[] args) {
        
        Test2 obj1 = new Test2(4);
        Test2 obj2 = new Test2(8);

        System.out.println("obj1 = " + obj1.a);
        System.out.println("obj2 = " + obj2.a);

        System.out.println("After swapping: ");
        obj1.swap(obj1, obj2);

        System.out.println("obj1 = " + obj1.a);
        System.out.println("obj2 = " + obj2.a);
    }
}

class Test2 {
    
    int a;
    
    Test2(int i) {
        a = i;
    }

    void swap(Test2 obj1, Test2 obj2) {
        int t = obj1.a;
        obj1.a = obj2.a;
        obj2.a = t;
    }
}