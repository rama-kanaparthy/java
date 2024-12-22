package exception;
public class MultipleExceptionsHandling {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException

            int result = 10 / 0;  // ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException - " + e.getMessage());
        }
    }
}

