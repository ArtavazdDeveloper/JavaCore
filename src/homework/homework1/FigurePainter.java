package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 5 - k; l++) {
                System.out.print("   ");
            }
            for (int i = 1; i <= k; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int l = 4; l >= 0; l--) {
            for (int k = 0; k <= l; k++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}