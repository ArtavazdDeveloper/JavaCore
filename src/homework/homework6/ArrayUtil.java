package homework.homework6;

public class ArrayUtil {
    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];


            }

        }
        System.out.println("min:" + min);
    }

    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println("max:" + max);
    }

    void evenOfArray(int[] array) {
        System.out.print("even: ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
    }

    void oddOfArray(int[] array) {

        System.out.print("odd: ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();
    }

    void quantityOfArray(int[] array) {
        int numbereven = 0;
        int numberood = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 == 0) {
                numbereven++;
            } else {
                numberood++;
            }
        }
        System.out.println("number of even: " + numbereven);
        System.out.println("number of odd: " + numberood);
    }

    void sumOfArray(int[] array) {
        int arraysum = 0;

        for (int i = 0; i < array.length; i++) {
            arraysum = arraysum + array[i];

        }
        System.out.println("sum of  array: " + arraysum);
    }

    void averageOfArray(int[] array) {
        int arraysum = 0;
        for (int i = 0; i < array.length; i++) {
            arraysum = arraysum + array[i];

        }
        int average = arraysum / array.length;
        System.out.println("average: " + average);
    }

}
