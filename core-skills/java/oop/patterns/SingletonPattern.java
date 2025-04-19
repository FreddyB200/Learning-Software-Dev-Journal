// Example 5: Singleton Design Pattern
/**
 * Demonstrates the Singleton pattern in Java.
 */
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.showMessage();
    }
    // Try: Make Singleton thread-safe.
}
