package com.shengmingji.responsibilitypattern.xiaoming;

public class Director extends Leader {
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("主管审批报销"+money +"元");
    }
}
