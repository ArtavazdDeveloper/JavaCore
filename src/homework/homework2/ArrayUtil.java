package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {


        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}

