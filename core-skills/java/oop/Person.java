// Example 1: Basic OOP - Person class
/**
 * Represents a simple person with name and age.
 * Demonstrates encapsulation, constructors, getters/setters, and toString().
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    // Try: create a list of Person objects and print them
}
