package DesignPattern.Creational.PrototypePattern;


/**
 * The Prototype Design Pattern is used when we want to create a new object by copying an existing object,
 * rather than creating it from scratch.
 *
 * This approach is useful when the process of creating the initial object is expensive or complex.
 * Instead of building an object step-by-step, we simply "clone" the existing one.
 */
public class prototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        DocumentRegistry documentRegistry=new DocumentRegistry();

        Document documentWithoutCloned=documentRegistry.getDocument("Employee");

        Document documentCloned=documentRegistry.getClonedDocument("Employee");

        System.out.println(documentWithoutCloned.hashCode());
        System.out.println(documentCloned.hashCode());



//        documentWithoutCloned.displayInfo();
//        documentCloned.displayInfo();

        documentCloned.footer="My foot change in main";

        System.out.println(documentWithoutCloned);
        System.out.println(documentCloned);



    }



}
