package chapter10;

/*
Эта программа содержит ошибку.
В последовательности операторов catch подкласс исключений должен быть указан перед его суперклассом,
иначе это приведет к недостижимому коду и ошибке во время компиляции.
 */
class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
    }
}