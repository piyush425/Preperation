package DesignPattern.SOLID.ISP;


/**
 *Interface should be such , that client ashould not implemented unnecessary function they do not need
 *
 * Each interface is focused on a specific task. Human implements both Workable and Eatable, but Robot only implements Workable, adhering to ISP.
 *
 * */



public class ISP {

    public static void main(String[] args) {

        Human human=new Human();

        human.eat();
        human.work();

        Robot robot=new Robot();
        robot.work();



    }
}
