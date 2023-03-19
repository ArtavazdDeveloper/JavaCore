package homeworks.CollectionExample;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Artavazd");
        names.add("Saak");
        names.add("Nune");
        names.add("Armine");
        names.add("Luiza");
        names.add("Eva");

        searchName(names);
        deleteName(names);
        nameSubstitution(names);


    }

    private static void nameSubstitution(ArrayList<String> names) {
        System.out.println("Write a name!");
        String userInformationName = scanner.nextLine();
        System.out.println("Write a index!");
        String index = scanner.nextLine();
        names.set(Integer.parseInt(index),userInformationName);
        System.out.println(names);
    }

    private static void deleteName(ArrayList<String> names) {
        System.out.println("Write a name to delete");
        String enteredName = scanner.nextLine();
            names.contains(enteredName);
            names.remove(enteredName);
            System.out.println(names);

        System.out.println("This name is not on the list!");
    }

    private static void searchName(ArrayList<String> names) {
        System.out.println("Please enter a name to search");
        String enteredName = scanner.nextLine();
        if (names.contains(enteredName)) {
            System.out.println("This name is on the list!");
        } else {
            System.out.println("This name is not on the list!");
        }
    }
}
