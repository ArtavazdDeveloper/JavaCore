package homework.homework7;

public class Calculator {
    int plus(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b ) {
        if (b == 0 ) {
            System.out.println("Не делится на 0 ");
            return -1;
        }
        return a / b;
    }
}
