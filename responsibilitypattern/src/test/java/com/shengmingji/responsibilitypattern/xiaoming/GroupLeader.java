package com.shengmingji.responsibilitypattern.xiaoming;

/**
 * Created by dell on 2018/1/14.
 */

public class GroupLeader extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长审批报销"+money +"元");
    }
}

