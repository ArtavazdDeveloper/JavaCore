package homeworks.CollectionExample;

import java.util.*;

public class CollectionExample2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        printWithoutRepetition(names);

        Set<String> name = new HashSet<>();
        sortedListOfNames(name);
    }

    private static void sortedListOfNames(Set<String> name) {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("Please input Name");
            String nameSort = scanner.nextLine();
            name.add(nameSort);
        }
        System.out.println("Sorted list of names.");
        System.out.println(name);
    }

    private static void printWithoutRepetition(Set<String> names) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Please input Name ");
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.println("List of names without repetition");
        for (String name : names) {
            System.out.println(name);
        }
    }

}
