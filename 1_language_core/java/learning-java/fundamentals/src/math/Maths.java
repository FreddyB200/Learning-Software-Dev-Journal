package math;


public class Maths {
    public static void main(String[] args) {
        //bigest number
        System.out.println(Math.max(5, 10));
        //smallest number
        System.out.println(Math.min(5, 10));
        //square root of a number
        System.out.println(Math.sqrt(64));
        //absolute value
        System.out.println(Math.abs(-45));
        //generate a random double number between 0.0 and 1.0
        System.out.println(Math.random());
        int randomNum = (int)(Math.random()*101);
        System.out.println(randomNum);

        //exercise
        /*Write a Java program to perform the following tasks:

        -Find the larger of three numbers.
        -Find the smaller of three numbers.
        -Calculate the area of a circle given its radius (use Math.PI for the value of π).
        -Generate a random integer between 50 and 150, inclusive.
        -Find the power of a number (raise a number to a specific power).
        -Find the angle in radians of a number (you can use Math.toRadians to convert degrees to radians).
        */

        //solution
        // max and min number between 3 numbers
        int num1 = 3, num2 = 12, num3 = 17, maxTemp, minTemp, smallestNum, biggestNum;
        maxTemp = Math.max(num1,num2);
        biggestNum = Math.max(maxTemp, num3);
        System.out.println("The biggest number is " + biggestNum);

        minTemp = Math.min(num1,num2);
        smallestNum = Math.min(minTemp, num3);
        System.out.println("The smallest number is " + smallestNum);

        //calculate the area of a circle given its radius
        double radius = 4;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area of the circle is "+ area);

        //generate a random integer between 50 and 150
        System.out.println((int)(Math.random() * (150 - 50 + 1)) + 50);
        //Find the power of a number
        int power = 3, numToPower = 5;
        System.out.println(Math.pow(numToPower, power));
        //Find the angle in radians of a number
        double degrees = 31.1;
        System.out.println(Math.toRadians(degrees));

    }
}
