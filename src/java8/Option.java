package java8;

import java.util.Optional;

public class Option {

    public static void main(String[] args) {

        int num=9;

        num=10;

        System.out.println(num);

//        Optional<String> name=getName();
//
//        name.ifPresent(x->System.out.println(name.get().toUpperCase()));
//
//        System.out.println(name.map(String::toUpperCase).orElse("No record found"));









    }

    public static Optional<String> getName() {
        return Optional.ofNullable(null);
    }
}
