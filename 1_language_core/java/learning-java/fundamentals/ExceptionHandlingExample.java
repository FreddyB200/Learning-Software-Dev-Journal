// Example: Exception Handling in Java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}
