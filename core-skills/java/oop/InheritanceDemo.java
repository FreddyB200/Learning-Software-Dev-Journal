// Example 2: Inheritance and Polymorphism
/**
 * Demonstrates inheritance, method overriding, and polymorphism with Animal, Dog, Cat classes.
 */
class Animal {
    public void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("The cat meows");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.speak(); // Output: The dog barks
        myCat.speak(); // Output: The cat meows
    }
    // Try: Add more animals and override speak()
}
