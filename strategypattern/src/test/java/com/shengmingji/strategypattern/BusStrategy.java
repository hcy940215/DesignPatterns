package com.shengmingji.strategypattern;

/**
 * Created by dell on 2017/12/28.
 */

public class BusStrategy implements CalculateStrategy {
    /**
     * 公交车 十公里内一元，超过十公里之后每加一元可以乘5公里
     *
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        //超过十公里的总距离
        int extraTotal = km - 10;
        //超过五公里的倍数
        int extraFactor = extraTotal / 5;
        //超过的距离对5公里取余
        int factor = extraTotal % 5;

        //计算价格
        int price = extraFactor + 1;
        return factor > 0 ? ++price : price;
    }
}
