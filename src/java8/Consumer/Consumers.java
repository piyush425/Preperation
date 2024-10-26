package java8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Consumer interface in Java is a functional interface that takes one input and performs an action on it, but does not return a result
 */

public class Consumers {

    public static void main(String[] args) {

        Consumer<String> str= s->System.out.println(s);

        str.accept("piyush");

        Consumer<List<Integer>> list=x->{
            for (Integer i:x){
                System.out.println(i+100);
            }
        };
        Consumer<List<Integer>> list2=x->{
            for (Integer i:x){
                System.out.println(i);
            }
        };

        //list.accept(Arrays.asList(1,2,3,4,5));

        list2.andThen(list).accept(Arrays.asList(1,2,3,4,5));

    }

}
