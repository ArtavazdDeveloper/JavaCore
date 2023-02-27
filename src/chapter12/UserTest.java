package chapter12;

import java.util.Scanner;

public class UserTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        User user = new User();
        user.name = "Poxos";
        user.surname = "Pjxjsyan";
        Language[] languages = Language.values();
        System.out.println("please choose from languages!");
        for (Language language : languages) {
            System.out.println(language);
        }
        String strLanguage = scanner.nextLine();
        try {
            user.language = Language.valueOf(strLanguage);
            System.out.println("for " + user.name + " selected Country is " + user.language.getCountry());
        } catch (IllegalArgumentException e) {
            System.out.println("Language is wrong!");
        }
    }
}

