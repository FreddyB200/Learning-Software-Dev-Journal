// Advanced Java Collections Example
import java.util.*;

public class CollectionsAdvancedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        Collections.shuffle(names);
        System.out.println("Shuffled names: " + names);
        Collections.sort(names);
        System.out.println("Sorted names: " + names);
        Set<String> nameSet = new HashSet<>(names);
        System.out.println("Unique names: " + nameSet);
        Map<String, Integer> nameLengths = new HashMap<>();
        for (String name : names) {
            nameLengths.put(name, name.length());
        }
        System.out.println("Name lengths: " + nameLengths);
    }
}
