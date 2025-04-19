package lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /*
        *Predicate
        * receives a value and returns a boolean
         */


        Predicate<Integer> intPredicate = (n) -> n.equals(11);

        boolean result = intPredicate.test(11);
        System.out.println(result);

        Predicate<Integer> isAdult = (a) -> a >= 18;
        System.out.println(isAdult.test(17));

        Predicate<String> stringPredicate = (S) -> S.length() > 5;
        System.out.println(stringPredicate.test("holaaaa"));
    }
}
