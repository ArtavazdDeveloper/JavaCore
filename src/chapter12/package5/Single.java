package chapter12.package5;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Одночленная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value(); // эта переменная должна иметь имя value
}
class Single {
    // аннотировать метод одночленной аннотацией
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value()); // выводит значение 100
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}