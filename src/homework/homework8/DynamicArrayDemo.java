package homework.homework8;
import homework.homework7.Calculator;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray myArray = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            myArray.add(i);
        }
        myArray.print();
        myArray.deleteByIndex(5);
        myArray.print();
    }
}
