package Collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<Emp> emp=new ArrayList<>();
        emp.add(new Emp("Piyush","Software",3));
        emp.add(new Emp("Aahul","BA",2));

        emp.sort(Comparator.comparing(Emp::getName));//new way

//       Collections.sort(emp,new NameBasedSort());


        Comparator.comparing(Emp::getEmpId);

        for (Emp e: emp){
            System.out.println(e);
        }

    }
}
