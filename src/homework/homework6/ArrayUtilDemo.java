package homework.homework6;

import java.util.Scanner;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");

        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {

            array[i] = input.nextInt();
        }
        ArrayUtil ar = new ArrayUtil();
        ar.minOfArray(array);
        ar.maxOfArray(array);
        ar.evenOfArray(array);
        ar.oddOfArray(array);
        ar.quantityOfArray(array);
        ar.sumOfArray(array);
        ar.averageOfArray(array);
    }


}

