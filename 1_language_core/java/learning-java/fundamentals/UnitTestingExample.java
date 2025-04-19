// Example: Unit Testing with JUnit (conceptual, not runnable without JUnit)
// To run this, you would need to add JUnit to your project dependencies.
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTestingExample {
    public int add(int a, int b) {
        return a + b;
    }
    @Test
    public void testAdd() {
        assertEquals(5, add(2, 3));
        assertEquals(0, add(-2, 2));
    }
}
