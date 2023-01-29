package chapter8.acce;

public class A {
    int i;
    private int j;
    void setJ(int x, int y){
        i = x;
        j = y;
    }
    class B extends A {
        int total;
        void sum(){
            total = i + j;
        }
    }
}
