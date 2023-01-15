package homework.homework7;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator ca = new Calculator();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int numbers = scn.nextInt();
        System.out.println("Enter numbers 2: ");
        int numbers2 = scn.nextInt();

        int sum = ca.plus(numbers, numbers2);
        int minus = ca.minus(numbers, numbers2);
        int multiply = ca.multiply(numbers, numbers2);
        int divide = ca.divide(numbers, numbers2);

        System.out.println("Sum: " + sum);
        System.out.println("Minus: " + minus);
        System.out.println("Multiply: " + multiply);
        System.out.println( "Divide:" + divide);

    }
}
