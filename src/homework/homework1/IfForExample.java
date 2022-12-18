package homework.homework1;

import java.net.SocketOption;
import java.util.Scanner;

public class IfForExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Number1: ");
        int a = scn.nextInt();
        System.out.println("Number2: ");
        int b = scn.nextInt();


        if (a > b) {
            System.out.println("max: " + a);
        } else if (a < b) {
            System.out.println("max: " + b);
        }
        if (a == b) {
            System.out.println("a equals b");
        } else if (a != b) {
            System.out.println("a no equals b");
        }
        System.out.print("Output: ");
        for (int i = a; i <= b; i++) {
            System.out.print(i + ",");
        }
        char x = ( char ) a;
        char y = ( char ) b;
        x = '&';
        y = 'a';

        System.out.println("\nСonverted a:" + x);
        System.out.println("Converted b:" + y);


    }
}


