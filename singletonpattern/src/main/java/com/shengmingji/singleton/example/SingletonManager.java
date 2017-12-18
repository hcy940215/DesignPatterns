package com.shengmingji.singleton.example;

import java.util.HashMap;

/**
 * 容器实现单例
 */

public class SingletonManager {
    private static HashMap<String, Object> objMap = new HashMap<>();

    private SingletonManager() {

    }

    public static void registerService(String key, Object value) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, value);
        }
    }

    public Object get(String key) {
        return objMap.get(key);
    }
}
