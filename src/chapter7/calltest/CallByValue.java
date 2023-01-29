package chapter7.calltest;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);

        ob.metch(a,b);
        System.out.println("a и b до вызова: " + a + " " + b);
    }
}
