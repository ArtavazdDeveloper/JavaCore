package chapter9.mypack2;

import chapter9.mypack.Balance;

public class TestBalance {
    public static void main(String[] args) {
        /* Класс Balance объявлен как puЬlic, поэтому им можно
           воспользоваться и вызвать его конструктор. */
        Balance test = new Balance("J.J.Jaspers", 99.88);
        test.show(); //можно также вызвать метод show()
    }
}
