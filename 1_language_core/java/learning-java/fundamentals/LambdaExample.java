// Example: Lambda Expressions and Functional Interfaces in Java
import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));
    }
}
