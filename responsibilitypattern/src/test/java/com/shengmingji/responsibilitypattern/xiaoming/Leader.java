package com.shengmingji.responsibilitypattern.xiaoming;

/**
 * Created by dell on 2018/1/14.
 */

public abstract class Leader {
    //上一级领导处理者
    protected Leader nexthandler;

    public void handlerRequest(int money){
        if (money<=limit()) {
            handle(money);
        }else {
            if (nexthandler != null) {
                nexthandler.handlerRequest(money);
            }
        }
    }

    /**
     * 自身能审批的额度
     * @return 额度
     */
    public abstract int limit();

    /**
     * 处理报账行为
     * @param money 具体金额
     */
    public abstract void handle(int money);
}
