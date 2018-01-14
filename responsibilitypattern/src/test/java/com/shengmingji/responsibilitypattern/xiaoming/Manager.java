package com.shengmingji.responsibilitypattern.xiaoming;

public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理审批报销"+money +"元");
    }
}
