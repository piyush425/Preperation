package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        str.chars().mapToObj(x->(char) x).filter(c->"h".indexOf(c)==-1).forEach(System.out::println);




    }
}
