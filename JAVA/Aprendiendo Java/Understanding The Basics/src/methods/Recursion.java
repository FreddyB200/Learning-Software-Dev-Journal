package methods;

public class Recursion {
    //la recursion es util para problemas como recorrer arboles o calcular factoriales
    public static int factorial(int n){
        //caso base: factorial de 0 o 1 es 1
        if (n == 0 || n ==1){
            return 1;
        }
        //caso recursivo: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n){
        //casos  bases
        if (n == 0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        //caso recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumOfNaturalNumbers(int n){
        if (n < 0 ){
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0){
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
    public static double power(double base, int exponent){

        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("0 no puede elvarse a un expontente negativo");
        }


        if (exponent == 0){
            return 1;
        }

        if (exponent < 0){
            return 1 / power(base, -exponent);
        }

        return base * power(base, exponent - 1);
    }


    public static void main(String[] args) {
        int number = 6;
        System.out.println("factorial of " + number + " is: " + factorial(number));
        System.out.println("Fibonacci of " + number + " is: " + fibonacci(number));
        System.out.println("The sum of the first " + number + " natural numbers (including 0) is: " + sumOfNaturalNumbers(number));
        System.out.println("2^3 = " + power(2, 3)); // Debe imprimir 8.0
        System.out.println("5^0 = " + power(5, 0)); // Debe imprimir 1.0
    }
}