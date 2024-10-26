package java8.Functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * The Function interface in Java is a functional interface that takes one input and returns a result
 *
 * Opertional
 */

public class Functions {

    public static void main(String[] args) {

        Function<String,Integer> function=x->x.length();
        System.out.println(function.apply("piyush"));

        List<Integer> list= Arrays.asList(2,4,5,3,7);
        Function<List,List> funcList=x->x.subList(0,2);
        System.out.println(Arrays.asList(funcList.apply(list)));

        Function<Integer,Integer> fuction1=x->x*2;
        Function<Integer,Integer> fuction2=x->x*x*x;

        //Functon chaining
        System.out.println(fuction1.andThen(fuction2).apply(2));
        System.out.println(fuction2.andThen(fuction1).apply(2));
        System.out.println(fuction1.compose(fuction2).apply(2));


        /** if Funtion<Integer,Integer> both is same object then we can use UnaryOperator**/

        UnaryOperator<Integer> unnary=x->x*2;
        System.out.println(unnary.apply(2));






    }
}
