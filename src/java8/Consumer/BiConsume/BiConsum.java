package java8.Consumer.BiConsume;

import java.util.function.BiConsumer;

public class BiConsum {

    public static void main(String[] args) {
        BiConsumer<String,String> s=(a,b)->System.out.println(a+" "+b);

        s.accept("hi","piyush");
    }
}
