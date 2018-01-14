package com.shengmingji.responsibilitypattern;

//具体处理者2
public class ConcreteHandler2 extends Handler {

    @Override
    public void handlerRequest(String conditon) {
        if (conditon.equals("ConcreteHandler2")) {
            System.out.println("ConcreteHandler2 handler");
        } else {
            successor.handlerRequest(conditon);
        }
    }
}
