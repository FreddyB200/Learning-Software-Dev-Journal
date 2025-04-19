// Mini Java Project: JavaAdvancedLearningApp
// This project demonstrates advanced Java: generics, exception handling, lambdas, collections, and unit testing (conceptual)
import java.util.*;
import java.util.function.Function;

class AdvancedUser<T> {
    private T id;
    private List<String> completedTopics = new ArrayList<>();
    public AdvancedUser(T id) { this.id = id; }
    public void completeTopic(String topic) {
        completedTopics.add(topic);
        System.out.println("User " + id + " completed: " + topic);
    }
    public void showProgress() {
        System.out.println("Progress for user " + id + ": " + completedTopics);
    }
}

public class JavaAdvancedLearningApp {
    public static void main(String[] args) {
        AdvancedUser<String> me = new AdvancedUser<>("Tanyer");
        List<String> topics = Arrays.asList("Generics", "Exception Handling", "Lambdas", "Collections", "Unit Testing");
        topics.forEach(me::completeTopic);
        // Lambda example
        Function<String, Integer> strLen = s -> s.length();
        System.out.println("Length of 'Advanced': " + strLen.apply("Advanced"));
        // Collections example
        Set<String> uniqueTopics = new HashSet<>(topics);
        System.out.println("Unique topics: " + uniqueTopics);
        // Exception handling example
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Handled exception: " + e.getMessage());
        }
        me.showProgress();
        System.out.println("Ready for expert-level Java!");
    }
}
