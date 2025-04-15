package logic.exercices;

import java.math.BigInteger;
import java.util.Scanner;


public class FibonacciLimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un limite para la secuencia: ");
        int n = scanner.nextInt();
        long inicio = System.currentTimeMillis();
        //int resultado = fibonacci(n);
        BigInteger resultado = calcFibonacci(n);



        System.out.println(resultado);
        long fin = System.currentTimeMillis();
        int digitos = resultado.toString().length();
        System.out.println(digitos);

        long duracion = fin - inicio;
        System.out.println("fibo: " + duracion + " ms");
        scanner.close();
        }

        public static int fibonacci(int n){
            if (n < 2) {
                return n;
            }
            return fibonacci(n -2) + fibonacci(n -1);
        }

        public static BigInteger calcFibonacci(int n){
        if (n <= 1){
            return BigInteger.valueOf(n);
        }
        BigInteger anterior = BigInteger.ZERO;
        BigInteger actual = BigInteger.ONE;

        for (int i =2; i <= n; i++){
            BigInteger siguiente = anterior.add(actual);
            anterior = actual;
            actual = siguiente;
        }
        return actual;
    }
}

