// Example 4: Abstract Classes
/**
 * Demonstrates abstract classes and methods.
 */
abstract class Vehicle {
    protected String brand;
    public Vehicle(String brand) { this.brand = brand; }
    public abstract void drive();
}

class Car extends Vehicle {
    public Car(String brand) { super(brand); }
    @Override
    public void drive() {
        System.out.println(brand + " car is driving.");
    }
}

class Bike extends Vehicle {
    public Bike(String brand) { super(brand); }
    @Override
    public void drive() {
        System.out.println(brand + " bike is driving.");
    }
}

// Try: Add more vehicle types and test their drive() methods.
