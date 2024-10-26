package DesignPattern.Creational.Signleton;

import java.util.Map;

/**
 * A Singleton is a design pattern that ensures a class has only one instance,
 * and provides a global point of access to that instance. In simple terms,
 * it's like having just one special item that everyone in the program can use,
 * and no one can create another one.
 */
public class Singleton {
    public static void main(String[] args) {

        CacheManager cacheManager1=CacheManager.getInstance();

        cacheManager1.addToCache("session1","123");

        CacheManager cacheManager2=CacheManager.getInstance();

        cacheManager2.addToCache("session1","456");

        Map<String, Object> result=cacheManager1.getCache();

        System.out.println(result.get("session1"));


        /**
         * ***** Without signleton in cache *****
         *
         * when the cachemanager2 update cache the change is not reflect in the cachemanager1 module cache
         * leading to data consistency
         */

    }
}
