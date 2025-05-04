package java8.FunctionalInterface;

/**
 * A functional interface is needed to use lambda expressions in Java. It has only one method, which makes it easy to use with lambdas. U
 * Using lambdas helps write code in a shorter and clearer way, instead of writing a lot of code with classes.
 */
@FunctionalInterface
public interface Employee {

    String getName();

    default String s(){
        return "piyush";
    }

}
