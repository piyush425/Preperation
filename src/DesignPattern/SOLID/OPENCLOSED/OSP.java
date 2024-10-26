package DesignPattern.SOLID.OPENCLOSED;


/**
 * OSP OPEN/CLOSED principle
 *
 * class is open for extension but closed for modification
 *
 * The Shape class is open for extension but closed for modification. You can add new shapes (like Circle) without changing existing code, following OCP.
 */
public class OSP {
    public static void main(String[] args) {

        shape rectangle=new rectangle(2.00,8.00);
        shape circle=new circle(3.00);


        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Circle Area: " + circle.area());

    }
}
