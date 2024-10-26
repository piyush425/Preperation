package DesignPattern.SOLID.ISP;

public class Human implements workable,eatable{
    @Override
    public void eat() {
        System.out.println("eat");

    }

    @Override
    public void work() {
        System.out.println("work");
    }
}
