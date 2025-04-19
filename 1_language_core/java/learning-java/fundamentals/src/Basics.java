import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {

        // Declaration and initialization of primitive data types
        byte myByte = 127;
        short myShort = 32767;
        int myInt = 100000;
        long myLong = 13214214211123L; // Indicates it is a "long" type by appending "L" at the end
        float myFloat = 10.421f; // Indicates it is a "float" type by appending "f" at the end
        double myDouble = 99.44;
        char myChar = 'F';
        boolean myBool = true;

        // String data type
        String myString = "hello world!";

        // Arrays
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 0, -1};

        // Print variables to console
        System.out.println("Primitive integer types:");
        System.out.println("byte: " + myByte);
        System.out.println("long: " + myLong);
        System.out.println("int: " + myInt);
        System.out.println("short: " + myShort);
        System.out.println("Decimal or real number types:");
        System.out.println("double: " + myDouble);
        System.out.println("float: " + myFloat);
        System.out.println("Character data type:");
        System.out.println("char: " + myChar);
        System.out.println("Boolean data type:");
        System.out.println("boolean: " + myBool);
        System.out.println("Declaration and initialization of primitive data types:");
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBool);

        // Print string variable
        System.out.println("String data type:");
        System.out.println("String: " + myString);

        // Print array variable
        System.out.println("Arrays:");
        System.out.println("Array: " + Arrays.toString(myArray));

        // Print array elements using a for loop
        System.out.println("Printing array elements using a for loop:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }

        // Find and print prime numbers from 1 to 100
        System.out.println("Prime numbers from 1 to 100:");
        byte nums = 100;
        int sumPrimes = 0;
        for (int i = 2; i <= nums; i++) {
            int counter = 0;
            for (int n = 1; n <= i; n++) {
                if (i % n == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println("Prime number: " + i);
                sumPrimes += i;
            }
        }
        System.out.println("Sum of all prime numbers from 1 to 100: " + sumPrimes);

        // Calculate and print sum of the first 100 numbers
        System.out.println("Sum of the first 100 numbers:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);
    }
}
