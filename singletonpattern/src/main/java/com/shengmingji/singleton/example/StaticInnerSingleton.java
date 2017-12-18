package com.shengmingji.singleton.example;

/**
 * 静态内部类单例(推荐)
 */

public class StaticInnerSingleton {
    public static StaticInnerSingleton getSingleton() {
        return SingletonHelp.SINGLRTON;
    }

    private static class SingletonHelp {
        private static final StaticInnerSingleton SINGLRTON = new StaticInnerSingleton();
    }
}
