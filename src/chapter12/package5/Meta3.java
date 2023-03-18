package chapter12.package5;

// Показать все аннотации для класса и метода

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация тестового класса")
@MyAnno3(str = "Meta3", val = 99)
class Meta3 {
    @What(description = "Аннотация тестового метода")
    @MyAnno3(str = "Тест", val = 100)
    public static void myMeth() {
        Meta3 ob = new Meta3();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            // вывести все аннотации для класса Meta3
            System.out.println("все аннотации для класса Meta3:");
            for (Annotation a : annos) System.out.println(a);
            System.out.println();

            // вывести все аннотации для метода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("все аннотации для метода myMeth():");
            for (Annotation a : annos) System.out.println(a);

        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
