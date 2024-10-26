package DesignPattern.Structural.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectProxy implements InvocationHandler {


    Object object;

    public ObjectProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("start");

        if(method.getName().contains("put")){
            if (args[0].equals("JAVA")){
                System.out.println("invalid key : "+args[0]);
                return null;
            }
        }


        Object invoke=method.invoke(object,args);

        System.out.println("end");


        return invoke;
    }
}
