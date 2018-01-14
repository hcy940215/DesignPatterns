package com.shengmingji.responsibilitypattern.request;

import com.shengmingji.responsibilitypattern.abshandler.AbstractRequest;

/**
 * Created by dell on 2018/1/14.
 */

public class Request2 extends AbstractRequest {
    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getHandleLevel() {
        return 2;
    }
}
