package exception;
public class BasicExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());  // Handle exception
        } finally {
            System.out.println("This will always execute.");
        }
    }
}
