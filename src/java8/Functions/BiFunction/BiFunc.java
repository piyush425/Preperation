package java8.Functions.BiFunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunc {


    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunction=(a, b)->a+b;
        System.out.println(biFunction.apply(2,4));

        BinaryOperator<Integer> binary=(a,b)->a+b;
        System.out.println(binary.apply(4,4));


    }
}
