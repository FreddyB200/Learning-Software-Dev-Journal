package lambdas.binary;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        /*
        * BinaryOperator
        * receives two values of the same datatype and return a value of the same datatype
         */

        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(12,12));

    }




}
