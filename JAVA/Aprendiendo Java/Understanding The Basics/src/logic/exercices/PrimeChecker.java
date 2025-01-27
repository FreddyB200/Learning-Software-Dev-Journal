package logic.exercices;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        //programa que pida al usuario un numero por terminal y le diga si dicho numero es primo o no.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que desee verificar si es primo o no:");
        int number = scanner.nextInt();


        if (isPrime(number)){
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado no es primo");
        }
        scanner.close();
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            int counter = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            return counter == 2;
        }
    }
}





