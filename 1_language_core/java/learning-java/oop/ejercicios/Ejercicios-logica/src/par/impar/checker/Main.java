package par.impar.checker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.println("----WELCOME TO THE EVEN-ODD CHEKER---");

        while (true){
            System.out.println("Enter a number or negative number to finish: ");
            num1 = scanner.nextInt();
            if (num1 < 0){
                break;
            }
            if (num1 == 0){
                System.out.println("The number " + num1 + " is not allowed.");
            } else if (isEven(num1)){
                System.out.println("The number " + num1 + " is even");
            } else {
                System.out.println("The number " + num1 + " is odd");
            }
        }

    }

    private static boolean isEven(int num1){
        if (num1 >= 1){
            if (num1 % 2 == 0) {
                return true;
             } else {
                return false;
            }
        }
        return false;
    }
}
