package chapter3;
public class DynInit {
    public static void main (String[] args){
        double a = 4.0, b = 3.0;

        // динамическая инициализация переменной c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
