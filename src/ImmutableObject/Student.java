package ImmutableObject;

import java.util.ArrayList;
import java.util.List;

/**
 *1.Declare the class *"final"* so it can't be extended
 *2.Make all the fields private so the direct access not allowed
 *3.Don't Provide setter Method for variables
 *4.Make all the field *"final"* so that value can be assigned only once
 *5.Initialize all fields using a constructor method performing deep copy.  (e.g friends)
 *6.perform Deep Copy in getter of mutable field. (e.g friends)
 */

final public class Student {

    final   private String name;

    final private String roll;

    final private String subject;


    final private List<String> friends;

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Student(String name, String roll, String subject, List<String> friends) {
        this.name = name;
        this.roll = roll;
        this.subject = subject;
        List<String> frnd=new ArrayList<>();
        friends.forEach(item->frnd.add(item));
        this.friends=frnd;
//        this.friends=friends;
    }

    public List<String> getFriends() {
        List<String> str=new ArrayList<>();
        this.friends.forEach(item->str.add(item));
        return str;
//        return this.friends;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", subject='" + subject + '\'' +
                ", friends=" + friends +
                '}';
    }
}
