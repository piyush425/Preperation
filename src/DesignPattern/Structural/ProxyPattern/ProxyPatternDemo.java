package DesignPattern.Structural.ProxyPattern;


/**
 * The Proxy Pattern is a design pattern where a substitute object, called a proxy, controls access to the real object.
 * It acts as a middleman between the client and the actual object, adding a layer of control.
 *
 * Easy-to-Remember Definition:
 * "Use a placeholder object to control access to another object."
 *
 * Real-World Analogy:
 * Imagine a security guard at the entrance of a building. You can't access the building directly; instead, the guard (proxy) checks your credentials and either allows or denies you access.
 *
 * So, the Proxy is just like a security guard that controls how you interact with the real object.
 */

public class ProxyPatternDemo {

    public static void main(String[] args) {

        ProxyRealImage proxyRealImage=new ProxyRealImage("87654");

        proxyRealImage.display();
        System.out.println();
        proxyRealImage.display();

    }
}
