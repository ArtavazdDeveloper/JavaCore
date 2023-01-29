package chapter7.overloadd;

public class Overload {
    public static void main(String[] args) {
        OverloadDemod ob = new OverloadDemod();
        int i = 88;

        ob.test();
        ob.test(10,  20);
        ob.test(i);
        ob.test(123.2);
    }
}
