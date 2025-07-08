package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.*;


/**
 *
 * Stream API is used for processing collections in a functional way (without loops).
 * It makes operations like filtering, mapping, and sorting easier.
 *
 * A Parallel Stream processes elements concurrently using multi ple threads, making it faster for large datasets.
 * List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
 *
 *         int sum = numbers.parallelStream()
 *                          .mapToInt(n -> n) // Convert to int
 *                          .sum();
 */

public class Stream {

    public static void main(String[] args) {



        List<Integer> list= Arrays.asList(2,3,4,5,6,7);

        List<Integer> result=list.stream().filter(x->x%2==0).collect(Collectors.toList());
        List<Integer> result2=list.stream().map((x)->x*2).collect(Collectors.toList());

        System.out.println(Arrays.asList(result));
        System.out.println(Arrays.asList(result2));

        String str="Piyush Ranjan";
        //str.chars().mapToObj(x->(char) x).forEach(x->System.out.println(x));

       // java.util.stream.Stream.of(str.split(" ")).forEach(x->System.out.println(x));

        //str.chars().mapToObj(x->(char) x).filter(c->"h".indexOf(c)==-1).forEach(System.out::println);

        IntStream intStream = str.chars();
        List<Integer> lists = intStream.boxed().collect(Collectors.toList());
        System.out.println(lists);


        String[] arr={"X","X","Y","Y"};
        int n=2;

        PriorityQueue<Integer> priorityQueue=new PriorityQueue();
        int start=0;

        for(int i=0;i<arr.length;i++){


        }








    }
}
