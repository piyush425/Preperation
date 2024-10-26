package java8;

import java.util.Optional;

public class Option {

    public static void main(String[] args) {

        Optional<String> name=getName();

        name.ifPresent(x->System.out.println(name.get().toUpperCase()));

        System.out.println(name.map(String::toUpperCase).orElse("No record found"));









    }

    public static Optional<String> getName() {
        return Optional.ofNullable(null);
    }
}
