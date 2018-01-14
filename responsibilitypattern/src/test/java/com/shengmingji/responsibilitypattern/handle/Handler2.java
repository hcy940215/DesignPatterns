package com.shengmingji.responsibilitypattern.handle;


import com.shengmingji.responsibilitypattern.abshandler.AbstractHandler;
import com.shengmingji.responsibilitypattern.abshandler.AbstractRequest;

/**
 * Created by dell on 2018/1/14.
 */

public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handle2 handle request:"+request.getHandleLevel());
    }
}
