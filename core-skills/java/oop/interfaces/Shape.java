// Example 3: Interfaces
/**
 * Demonstrates interface usage and implementation.
 */
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
    public double perimeter() { return 2 * Math.PI * radius; }
}

class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() { return width * height; }
    public double perimeter() { return 2 * (width + height); }
}

// Try: Create a list of shapes and print their area/perimeter.
