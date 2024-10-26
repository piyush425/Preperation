package DesignPattern.Structural.ProxyPattern.DynamicProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {

        Map<String,Object> map=(Map)Proxy.newProxyInstance(HashMap.class.getClassLoader(),new Class[]{Map.class},new ObjectProxy(new HashMap<>()));

        map.put("JAVA",987);
        map.put("C++",98);

        System.out.println(map);

    }
}
