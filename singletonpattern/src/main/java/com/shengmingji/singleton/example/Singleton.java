package com.shengmingji.singleton.example;

/**
 * 饿汉式单例
 */

public class Singleton{

    /**
     * 饿汉式单例
     */
    private static final Singleton singleton = new Singleton();

    /**
     * 私有化构造方法
     */
    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }
}


