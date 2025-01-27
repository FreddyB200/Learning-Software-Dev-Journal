package calcular.mayor.menor;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, numMayor, numMenor;

        System.out.println("Ingrese un numero: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese otro numero: ");
        num2 = scanner.nextInt();

        System.out.println("Ingrese un ultimo numero: ");
        num3 = scanner.nextInt();

        numMayor = calcNumMayor(num1, num2, num3);
        numMenor = calcNumMenor(num1, num2, num3);

        System.out.println("el numero mayor es el: "+ numMayor + "\nEl numero menor es el: "+ numMenor);

        scanner.close();
    }

    /**
     * esta funcion sirve para retornar el numero mayor entre 3 numeros
     * @param num1 es el primer numero
     * @param num2 es el segundo numero
     * @param num3 es el tercer numero
     * @return menor
     */
    private static int calcNumMayor(int num1, int num2, int num3){
        int mayor = num1;
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }
        return mayor;
    }

    /**
     * Esta funcion retorna el numero menor entre 3 numeros
     * @param num1 este es el primer numero
     * @param num2 este es el segundo numero
     * @param num3 este es el tercer numero
     * @return menor
     */
    private static int calcNumMenor(int num1, int num2, int num3){
        int menor = num1;
        if (num2 < menor){
            menor = num2;
        }
        if (num3 < menor){
            menor = num3;
        }
        return menor;
    }
}
