package homework.homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 4; i >= 1; i--) {
            for (j = 9; j > i; j--) {
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(" " + '*');

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (i = 1; i <= 4; i++) {
            for (j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (i = 3; i >= 1; i--) {
            for (j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}


