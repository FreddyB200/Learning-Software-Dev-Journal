package control_structures.exercices;

import java.util.Scanner;

public class GraficosBarra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        boolean flag = true;
        System.out.println("Debe ingresar 5 numeros entre 1 y 30 a continuacion: ");
        for(int i = 1; i<=5;i++){
            while (flag){
                System.out.println("Ingrese el numero " + i+": ");
                num = scanner.nextInt();
                if((num < 1) || (num > 30)) {
                    System.out.println("ingrese un numero entre 1 y 30");
                } else {
                    flag = false;
                }
            }
            flag = true;

            switch (i){
                case 1:
                    num1 = num;
                    break;

                case 2:
                    num2 = num;
                    break;

                case 3:
                    num3 = num;
                    break;

                case 4:
                    num4 = num;
                    break;

                case 5:
                    num5 = num;
                    break;
            }

        }
        System.out.printf("%n");
        for(int i = 0; i<=num1; i++){
            System.out.printf("*");
        }
        System.out.printf("%n");
        for(int i = 0; i<=num2; i++){
            System.out.printf("*");
        }
        System.out.printf("%n");
        for(int i = 0; i<=num3; i++){
            System.out.printf("*");
        }
        System.out.printf("%n");
        for(int i = 0; i<=num4; i++){
            System.out.printf("*");
        }
        System.out.printf("%n");
        for(int i = 0; i<=num5; i++){
            System.out.printf("*");
        }
    }
}
