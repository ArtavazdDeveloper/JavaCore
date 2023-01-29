package chapter7.passob;

public class Test {
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    void  metch(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
