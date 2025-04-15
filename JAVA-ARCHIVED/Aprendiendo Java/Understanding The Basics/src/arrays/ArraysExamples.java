package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array de clientes
        String clientes[] = new String[6];
        clientes[0] = "Jose mendiola";
        clientes[1] = "maria castro";
        clientes[2] = "Roso debia";
        clientes[3] = "Familia Rios";
        clientes[4] = "Familia Ezquivel";
        clientes[5] = "Familia cardenas";

        //array para alamacenar diferentes precios
        int precios[] = new int[clientes.length];
        for (int i = 0; i < precios.length; i++) {
            System.out.println("dame el precio: ");
            precios[i] = sc.nextInt();
        }


        //array storing different ages
        int edades[] = {20, 22, 18, 35, 48, 26, 87, 70};

        //iterando a el array de precios metodo 1
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
        //iterando a el array de precios metodo 2
        for (int precio : precios) System.out.println(precio);

        //iterando a el array de clientes metodo 1
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
        //iterando a el array de clientes metodo 2
        for (String cliente : clientes) System.out.println(cliente);
        ;


        float avg, sum = 0;
        //iterando a el array edades
        for (int edad : edades) sum += edad;

        avg = sum / edades.length;

        //promedio de edades
        System.out.println("Average is " + avg);

        //getting the length of the arrays
        System.out.println("cantidad de elementos del array precios es: " + precios.length);
        System.out.println("cantidad de elementos del array clientes es: " + clientes.length);
        System.out.println("cantidad de elementos del array edades es: " + edades.length);

        //EXERCISE
        //Create a program that finds the lowest age among different ages of the array edades
        int length = edades.length;
        int lowestAge = edades[0];

        for (int age : edades) if (age < lowestAge) lowestAge = age;
        System.out.println("The lowest age in the array is: " + lowestAge);

        //ejercicios
        int[] numberArray = new int[4];
        numberArray[0] = 3;
        numberArray[1] = 6;
        numberArray[2] = 12;
        numberArray[3] = 8;

        //Crear un programa para calcular el promedio de números en un array.
        double totalSum = 0;
        for (int number : numberArray) {
            totalSum += number;
        }
        double average = totalSum / numberArray.length;
        System.out.println("el promedio de los numeros del array es: " + average);

        //Buscar el número mayor en un array.
        int numeroMayor = numberArray[0];
        for (int number : numberArray) {
            if (number > numeroMayor) {
                numeroMayor = number;
            }
        }
        System.out.println("el numero mayor es: " + numeroMayor);

        //Ordenar un array de menor a mayor.
        //forma 1 con Clase Array

        Arrays.sort(numberArray);
        System.out.println("El Array ordenado de menor a mayor: ");
        for (int number : numberArray) {
            System.out.println(number + " ");
        }
        //forma 2 con algoritmo por seleccion
        for (int i = 0; i < numberArray.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[j] < numberArray[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = numberArray[i];
            numberArray[i] = numberArray[indiceMenor];
            numberArray[indiceMenor] = temp;
        }
        System.out.println("Array ordenado manualmente de menor a mayor: ");
        for (int numero : numberArray) {
            System.out.print(numero + " ");


        }
    }
}