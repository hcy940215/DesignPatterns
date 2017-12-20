package com.shengmingji.designpatterns;

/**
 * Director类，负责构造Computer
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String broad,String dispplay){
//        builder.builderBoard(broad);
//        builder.builderDisplay(dispplay);
//        builder.builderOS();
    }
}
