package lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /*
        * Function
        * receives a value and returns a value
         */

        Function<Integer, String> function =  (num) -> "El numero es : " + num;

        String result = function.apply(12);
        System.out.println(result);


    }
}
