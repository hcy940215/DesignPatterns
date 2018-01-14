package com.shengmingji.responsibilitypattern.abshandler;

/**
 * Created by dell on 2018/1/14.
 */

public abstract class AbstractRequest {
    //处理 对象
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取处理的内容对象
     * @return 具体的处理对象
     */
    public Object getContent(){
        return obj;
    }

    /**
     * 获取请求级别
     * @return 请求级别
     */
    public abstract int getHandleLevel();
}
