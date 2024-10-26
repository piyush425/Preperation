package DesignPattern.Creational.Signleton;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    private static CacheManager instance;

    private Map<String, Object> cache;

    private CacheManager() {
        this.cache = new HashMap<>();
    }

    public static CacheManager getInstance() {

        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;

    }

    public void addToCache(String key, Object value) {
        this.cache.put(key, value);
    }

    public Map<String, Object> getCache() {
        return this.cache;
    }

}
