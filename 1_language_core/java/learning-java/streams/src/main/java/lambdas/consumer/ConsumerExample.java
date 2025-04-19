package lambdas.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

    /*
     *  Consumer
     *  Receives a value and returns nothing
    */

//        Consumer<String> consumer = (param) -> {
//            System.out.println(param);
//        };

//        Consumer<String> consumer = param -> System.out.println(param);

        Consumer<String> consumer = System.out::println;
        consumer.accept("freddy");


        List<String> nombres = List.of("maria", "juan", "daniel");
        //(param) -> {sout(param)}
        nombres.forEach(n -> System.out.println(n));

    }
}
