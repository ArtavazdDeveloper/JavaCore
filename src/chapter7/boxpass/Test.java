package chapter7.boxpass;

public class Test {
    int a , b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    boolean equalTo(Test o){
        if (o.a == a && o.b == b) {
            return true;
        }
            return false;
    }
}
