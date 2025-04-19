package lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        /*
         * BiConsumer
         *  Takes 2 values and return nothing
         */

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);

        biConsumer.accept("hola", "mundo");
    }
}
