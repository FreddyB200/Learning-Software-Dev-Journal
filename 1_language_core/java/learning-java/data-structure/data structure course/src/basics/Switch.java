package basics;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);


        double result = 0;
        boolean validOperation = true;

        System.out.println("Type the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Type the second number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Select a operation:" +
                "\n1. Sum" +
                "\n2. Rest" +
                "\n3. Mult." +
                "\n4. Div.");



        System.out.println("Type the number of the operation:");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                break;

            case 2:
                result = firstNumber - secondNumber;
                break;

            case 3:
                result = firstNumber * secondNumber;
                break;

            case 4:
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                }
                else{
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }

                break;

            default:
                System.out.println("Type a correct number option.");
                validOperation = false;
        }

        if(validOperation){
            System.out.println("The result for the operation is: " + result);
        }

        scanner.close();

    }

}
