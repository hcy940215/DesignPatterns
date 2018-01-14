package com.shengmingji.responsibilitypattern;


public abstract class Handler {
    protected Handler successor;

    /**
     * 请求处理
     * @param conditon 请求条件
     */
    public abstract void handlerRequest(String conditon);

}