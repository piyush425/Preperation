package DesignPattern.SOLID.LSP;


/**
 *
 *  Liskov Substitution Principle (LSP)
 *
 * If a class is a parent (superclass), then all its children (subclasses) should behave in the same way.
 * You should be able to replace the parent with any child without breaking the program.
 *
 * Think of It Like This:
 * Imagine you have a remote control that works for any TV. If you can swap the old TV with a new model and the remote still works without problems, that's LSP in action.
 *
 * Remote = Parent (Superclass)
 * Old TV = One child (subclass)
 * New TV = Another child (subclass)
 * You should be able to replace the old TV with the new TV, and the remote (parent class) should still function correctly. If the remote stops working after switching TVs, it breaks LSP.
 *
 *
 */

public class LSP {

    public static void main(String[] args) {

        Bird bird=new Sparrow(); // Replacing parent (Bird) with child (Sparrow)
        // It should still fly without issues

        bird.fly();

    }
}
