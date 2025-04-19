package lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /*
        * Supplier
        * does not receive any value (params), but returns a result
         */

        Supplier<String> supplier = () -> "Hola soy un supplier";
        System.out.println(supplier.get());

        Supplier<Integer> intSupplier = () -> 2*2;
        Integer result = intSupplier.get();
        System.out.println(result);

        //in lambda functions there is no bisupplier because in java there is no multiple return.
    }
}
