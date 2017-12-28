package com.shengmingji.strategypattern;

import org.junit.Test;

/**
 * Created by dell on 2017/12/28.
 */

public class TranficCalculator {
    @Test
    public void main() {
        TranficCalculator calculator = new TranficCalculator();
        //设置计算策略
        calculator.setmStratefy(new TaxiStrategy());
        System.out.println("公交车乘16公里的价格："+calculator.calculatePrice(16));
    }

    CalculateStrategy mStratefy;

    public int calculatePrice(int km){
        return mStratefy.calculatePrice(km);
    }
    public void setmStratefy(CalculateStrategy mStratefy) {
        this.mStratefy = mStratefy;
    }
}
