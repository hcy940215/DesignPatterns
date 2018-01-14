package com.shengmingji.responsibilitypattern.handle;


import com.shengmingji.responsibilitypattern.abshandler.AbstractHandler;
import com.shengmingji.responsibilitypattern.abshandler.AbstractRequest;

/**
 * Created by dell on 2018/1/14.
 */

public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handle1 handle request:"+request.getHandleLevel());
    }
}
