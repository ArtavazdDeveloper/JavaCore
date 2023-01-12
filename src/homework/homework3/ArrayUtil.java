package homework.homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = { 2, 5, 8, 10, 15, 32, 22, 13, 11, 66, 12, 113, 30, 68, 111, 80, 119,  82, 117, 123, 124 };

        int numbereven = 0;
        int numberood = 0;
        int arraysum = 0;

        int numbrarray = 0;
        int average = 0;
        System.out.print("even : ");

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("odd : ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 == 0) {
                numbereven++;
            } else  {
                numberood++;
            }
        }
        System.out.println("number of even : " + numbereven );
        System.out.println("number of odd : " + numberood);

        for (int i = 0; i < array.length; i++) {
            arraysum = arraysum + array[i];
        }

        System.out.println("sum of  array : " + arraysum);
        System.out.println("amount of elements:" + array.length);
        average = arraysum / array.length;
        System.out.println("average : " + average);
        System.out.println("first elements : " + array[0] );
        System.out.println("last elements : " + array[20] );
        System.out.println("last elements : " + array[10] );


    }
}