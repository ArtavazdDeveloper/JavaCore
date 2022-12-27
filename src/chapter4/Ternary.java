package chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? - i : i; // получить обсалютное
                            // значение переменной i
        System.out.print(" Абсолютное значение ");
        System.out.println(i + " равно " + k);
        i = - 10;
        k = i < 0 ? - i : i;  // получить абсолютное
                             // значение переменной i
        System.out.print("Абсолютное значение  ");
        System.out.print("Абсолютное значение  ");
        System.out.println(i + " равно " + k);
     }
}
