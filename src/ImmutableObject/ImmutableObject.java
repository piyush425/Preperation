package ImmutableObject;

import java.util.ArrayList;
import java.util.List;

public class ImmutableObject {
    public static void main(String[] args) {
        System.out.println("immutable object created");

        List<String> friend=new ArrayList<>();
        friend.add("piyush");


        Student student=new Student("piyush","29","Math",friend);
        System.out.println(student);

        List<String> str=student.getFriends();
        str.add("Ranjan");

        friend.add("piyush");

        System.out.println(student);







    }
}
