package com.shengmingji.observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 程序员是观察者
 */
 class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hello "+name+" 内容:"+arg);
    }

    @Override
    public String toString() {
        return "程序员："+name;
    }
}

public class PublicDev extends Observable{
    public void postNewPublication(String content){
        //标识状态或者内容发生改变
        setChanged();

        //通知所有观察者
        notifyObservers(content);
    }
}

