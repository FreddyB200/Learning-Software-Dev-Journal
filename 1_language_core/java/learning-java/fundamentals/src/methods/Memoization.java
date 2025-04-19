package methods;
import java.util.HashMap;
import java.util.Map;

public class Memoization {

    private static Map<Integer, Integer> memo = new HashMap<>();
    //memotodo recursivo con memoizacion
    public static int fibonacci(int n){
        //si ya calculamos este valor, lo devolvemos
        if (memo.containsKey(n)){
            return memo.get(n);
        }
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int result = fibonacci(n-1) + fibonacci(n-2);
        memo.put(n, result); //almacenamos el resultado
        return result;
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println("Fibonacci if " + number + " is: " + fibonacci(number));
    }

}

