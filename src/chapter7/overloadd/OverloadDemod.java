package chapter7.overloadd;

public class OverloadDemod {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println(" a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Врутреннее преобразование при вызове " + " test(double) a: " + a);
    }
}

