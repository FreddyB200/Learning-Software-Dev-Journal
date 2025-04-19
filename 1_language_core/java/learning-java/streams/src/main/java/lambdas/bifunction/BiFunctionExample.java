package lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /*
        * Bifunction
        * receives two values and returns 1 result
         */

        BiFunction<Integer, String, String> biFunction = (n, t) -> t + " " + n;

        String result = biFunction.apply(12, "hola");
        System.out.println(result);



    }
}
