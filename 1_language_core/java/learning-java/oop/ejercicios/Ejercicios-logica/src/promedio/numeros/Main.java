package promedio.numeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, promedio;

        System.out.println("----BIEVENIDIO A LA CALCULADORA DE PROMEDIO----");
        System.out.println("Ingrese un numero: ");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese otro numero: ");
        num2 = scanner.nextDouble();

        System.out.println("Ingrese un ultimo numero: ");
        num3 = scanner.nextDouble();

        promedio = calAverage(num1, num2, num3);

        System.out.println("El promedio de los numeros "+ num1 +", "+ num2 +" y "+ num3 + " es de: "+ promedio);
        scanner.close();
    }

    private static double calAverage(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3;
    }
}
