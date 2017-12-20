package com.shengmingji.designpatterns;

import org.junit.Test;

/**
 * 计算机抽象类，即Produce角色
 */

public abstract class Computer {
    protected  String mBoard;
    protected String mDisplay;
    protected String mOs;

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setmOs();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
