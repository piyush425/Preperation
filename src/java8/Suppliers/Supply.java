package java8.Suppliers;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Supply {

    public static void main(String[] args) {

        Supplier<Integer> supplier= ()->100;

        System.out.println(supplier.get());


        //let's use everything combined

        Predicate<Integer> predicate=x->x%2==0;
        Function<Integer,Integer> function=x->x*x;
        Consumer<Boolean> consume=x->System.out.println(x);
        Supplier<Integer> supply=()->2;

        System.out.println(function.apply(supply.get()));
        System.out.println(predicate.test(function.apply(supply.get())));
        consume.accept(predicate.test(function.apply(supply.get())));



    }
}
