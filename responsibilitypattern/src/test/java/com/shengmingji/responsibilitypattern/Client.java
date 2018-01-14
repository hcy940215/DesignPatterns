package com.shengmingji.responsibilitypattern;

import com.shengmingji.responsibilitypattern.handle.Handler1;
import com.shengmingji.responsibilitypattern.handle.Handler2;
import com.shengmingji.responsibilitypattern.handle.Handler3;
import com.shengmingji.responsibilitypattern.request.Request1;
import com.shengmingji.responsibilitypattern.request.Request2;
import com.shengmingji.responsibilitypattern.request.Request3;

import org.junit.Test;

/**
 * Created by dell on 2018/1/14.
 */

//客户类
public class Client {
    @Test
    public void test() {
        //构造一个ConcreteHandler1对象
        ConcreteHandler1 handler1 = new ConcreteHandler1();

        //构造一个ConcreteHandler2对象
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        //设置handler1的下一个节点
        handler1.successor = handler2;

        //设置handler2的下一个节点
        handler2.successor = handler1;

        //处理请求
        handler1.handlerRequest("ConcreteHandler2");
    }

    @Test
    public void main(){
        //构造三个处理者对象
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();

        //设置当前处理者对象的下一个节点
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        //构造三个请求者对象
        Request1 request1 = new Request1("Request1");
        Request2 request2 = new Request2("Request2");
        Request3 request3 = new Request3("Request3");

        //总是从链式的首端发起请求
        handler1.handleRequest(request1);
        handler2.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}