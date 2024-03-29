package chapter10;

// Продемонстрировать применение оператора throw
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("демонстрация"); // Создать объект стандартных исключений в Java
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc()");
            throw e; // повторно сгенерировать исключение
        }
    }

    public static void main (String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
/*
Здесь операция new служит для создания экземпляра исключения типа NullPointerException.
Многие классы встроенных в Java исключений, возникающих во время выполнения, имеют
по меньшей мере две формы конструктора: без параметров и со строковым параметром.
Если применяется вторая форма конструктора, его аргумент обозначает символьную строку, описывающую исключение.
Эта символьная строка выводится, когда объект исключения передается в качестве аргумента методу print() или println().
Она может быть также получена в результате вызова метода getMessage(), определенного в классе Throwable.
-------------------------------------------------------------
Исключение перехвачено в теле метода demoproc()
Повторный перехват: java.lang.NullPointerException: демонстрация
 */