package com.shengmingji.observerpattern;

/**
 * Created by dell on 2018/1/15.
 */

public class Test {

    @org.junit.Test
    public  void test() {
        //被观察者角色
        PublicDev dev = new PublicDev();

        //创建观察者
        Coder coder1 = new Coder("coder1");
        Coder coder2 = new Coder("coder2");
        Coder coder3 = new Coder("coder3");

        //将观察者注册到可观察对象的观察者列表中
        dev.addObserver(coder1);
        dev.addObserver(coder2);
        dev.addObserver(coder3);

        dev.postNewPublication("公众号更新文章啦");
    }
}
