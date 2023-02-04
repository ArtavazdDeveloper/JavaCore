package homework.homework9;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker bc = new BraceChecker("Hello from [Java)");
        bc.check();
    }
}
//if (lastSimvol != '(') {
       // System.out.println("Error at " + i + " index Closed " + c + " but not open.");