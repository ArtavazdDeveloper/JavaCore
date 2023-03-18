package chapter19;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp2 implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }
}
class CompDemo2 {
    public static void main(String[] args) {
        MyComp2 mc = new MyComp2(); // создать компаратор

        // передать вариант компаратора типа MyCornp с обратным
        // упорядочением древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());

        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for (String element : ts) {
            System.out.print(element + " ");
        }
    }
}
