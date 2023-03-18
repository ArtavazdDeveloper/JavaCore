package chapter9.Stack;
// Определить интерфейс для целочисленного стека
public interface IntStack {
    void push(int item); // сохранить элемент в стеке
    int pop(); // извлечь элемент из стека

    // метод очищающий стек по умолчанию
    default void clear() {
        System.out.println("Метод очищающий стек пока не реализован.");
    }
}
