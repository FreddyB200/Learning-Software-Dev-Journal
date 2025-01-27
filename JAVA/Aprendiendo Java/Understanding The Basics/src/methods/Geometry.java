package methods;

public class Geometry {

    //class scope
    static int numero;  //variable de clase (class scope)
    int num; // variable de instancia (class scope)

    public static void main(String[] args) {
        // Calculate area of a triangle
        double triangleArea = area(2, 3, "equilateral");
        System.out.println("The area of the triangle is: " + triangleArea);

        // Calculate area of a rectangle
        double rectangleArea = area(5, 2);
        System.out.println("The area of the rectangle is: " + rectangleArea);

        // Calculate area of a circle
        double circleArea = area(5);
        System.out.println("The area of the circle is: " + circleArea);

    }

    // Method to calculate the area of a circle
    public static double area(double radius) {
        return Math.PI * (radius * radius);
    }

    // Method to calculate the area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double area(double base, double height, String type) {
        if (type.equalsIgnoreCase("equilateral")) {
            // Formula for equilateral triangle
            return (Math.sqrt(3) / 4) * (base * base);
        } else {
            // Default formula for right triangle
            return (base * height) / 2;
        }
    }
}