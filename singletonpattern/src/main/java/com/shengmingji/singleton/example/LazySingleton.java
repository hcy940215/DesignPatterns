package com.shengmingji.singleton.example;

/**
 * 懒汉式单例
 */

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){

    }

    public static synchronized LazySingleton getInstance(){
        if (instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
