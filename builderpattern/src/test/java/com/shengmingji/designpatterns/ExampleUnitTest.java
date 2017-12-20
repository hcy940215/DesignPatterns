package com.shengmingji.designpatterns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test(){
//        MacbookBuilder builder = new MacbookBuilder();
//
//
//        Director director = new Director(builder);
//        //封装构建过程
//        director.construct("英特尔主板","Retina显示器");
//
//        System.out.println(builder.create().toString());


        Computer computer = new MacbookBuilder()
                .setBoard("英特尔")
                .setDisplay("Retina显示器")
                .setOS()
                .create();
        System.out.println(computer.toString());

    }
}