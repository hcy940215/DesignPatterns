package com.shengmingji.responsibilitypattern.handle;


import com.shengmingji.responsibilitypattern.abshandler.AbstractHandler;
import com.shengmingji.responsibilitypattern.abshandler.AbstractRequest;



public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handle3 handle request:"+request.getHandleLevel());
    }
}
