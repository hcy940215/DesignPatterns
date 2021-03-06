package com.shengmingji.designpatterns;

/**
 * 抽象Builder类
 */

public abstract class Builder {
    public abstract Builder setBoard(String board);

    public abstract Builder setDisplay(String display);

    public abstract Builder setOS();

    public abstract Computer create();

//    public abstract void builderBoard(String board);
//    public abstract void builderDisplay(String display);
//    public abstract void builderOS();
}
