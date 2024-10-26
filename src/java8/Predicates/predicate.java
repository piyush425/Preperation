package java8.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * "A Predicate is a functional interface in Java that takes one input and returns true or false based on a condition.
 *
 * boolean based function
 */

public class predicate {
    public static void main(String[] args) {
        Predicate<Integer> checkGreaterthanThousand=(x)->x>1000;
        System.out.println(checkGreaterthanThousand.test(2));

        /**this . filer is use predicate functional interface**/
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> finalList=list.stream().filter(x->x>5).collect(Collectors.toList());
        System.out.println(Arrays.asList(finalList));



        Predicate<String> checkWithLetterP = x -> x.toLowerCase().charAt(0) == 'p';
        Predicate<String> checkWithLastLetterL = x -> x.toLowerCase().charAt(x.length()-1) == 'h';

        Predicate<String> and=checkWithLetterP.and(checkWithLastLetterL);
        Predicate<String> or=checkWithLetterP.or(checkWithLastLetterL);
        System.out.println(checkWithLetterP.test("piyush"));
        System.out.println(and.test("piyus"));
        System.out.println(checkWithLetterP.negate().test("piyush"));


        Predicate<Object> isEqual=Predicate.isEqual("Piysuh");
        System.out.println(isEqual.test("Piysh"));
    }
}
