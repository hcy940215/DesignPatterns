package com.shengmingji.singleton.example;

/**
 * Double Check Lock实现单例
 */

public class DCLSingleton {
    private static DCLSingleton singleton;

    private DCLSingleton() {
    }

    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
