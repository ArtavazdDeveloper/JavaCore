package chapter10;

public class ReturnCatchFinally {
    public static void main(String[] args)  {
        System.out.println(getHelloWorld());
    }
    public static String getHelloWorld() {
        try {
            return "TryString";
        } catch (Exception e) {
            return "CatchString";
        } finally {
            return "FinallyString";
        }
    }
}
/* ----------
FinallyString
 */