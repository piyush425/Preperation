package java8.Predicates.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicates {

    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate=(a, b)->a%2==0 && b%2==0;
        System.out.println(biPredicate.test(2,4));

    }

}
