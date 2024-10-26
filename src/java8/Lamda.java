package java8;

import java8.FunctionalInterface.Employee;


/**
 * Java does not allow local variables to be modified inside lambda expressions because local variables must be final or effectively final.
 * This is to ensure predictable behavior, thread safety, and to prevent issues like race conditions and memory inconsistency.
 * However, instance variables can be modified in lambdas because they are stored on the heap and captured by reference, making them safe to modify.
 */
public class Lamda {
    public static void main(String[] args) {

        Employee employee1=()->"piyush";
        System.out.println(employee1.getName());
        String a="9";


        Runnable employee=()->{

            System.out.println(a);

        };

        Employee employee2=()->{
            System.out.println(a);
            return "99";
        };

    }

//    private static void doSomething() {
//        int a=6;
//
//        Employee employee=()->{
//            a=9;
//            return "100";
//
//        };
//        System.out.println(employee.getName());
//    }
}
