package com.shengmingji.responsibilitypattern;

//具体的处理者1
public class ConcreteHandler1 extends Handler {

    @Override
    public void handlerRequest(String conditon) {
        if (conditon.equals("ConcreteHandler1")) {
            System.out.println("ConcreteHandler1 handler");
        } else {
            successor.handlerRequest(conditon);
        }
    }
}
