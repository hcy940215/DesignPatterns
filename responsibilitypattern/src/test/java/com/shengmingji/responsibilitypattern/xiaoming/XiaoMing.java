package com.shengmingji.responsibilitypattern.xiaoming;

import org.junit.Test;

/**
 * Created by dell on 2018/1/14.
 */

public class XiaoMing {
    @Test
    public void main() {
        //构造各个领导
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();
        //设置上一级领导处理者
        groupLeader.nexthandler = director;
        director.nexthandler = manager;
        manager.nexthandler = boss;
        //发起请求
        groupLeader.handlerRequest(50000);
    }

}
