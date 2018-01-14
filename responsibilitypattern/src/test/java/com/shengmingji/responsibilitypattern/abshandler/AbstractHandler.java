package com.shengmingji.responsibilitypattern.abshandler;


public abstract class AbstractHandler {

    public AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest request){
        //判断当前处理者对象的处理级别是否与请求者的处理级别一致
        if (getHandleLevel()==request.getHandleLevel()){
            handle(request);
        }else {
            //否则将请求对象转发给下一个节点上的请求对象
            if (nextHandler!=null){
                nextHandler.handleRequest(request);
            }else {
                //当所有处理者对象均不能处理该请求输出
                System.out.println("All of handler can't handle the request");
            }
        }
    }

    /**
     * 获取处理者对象的处理级别
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理者对象的具体处理方式
     * @param request 请求者对象
     */
    protected abstract void handle(AbstractRequest request);

}
