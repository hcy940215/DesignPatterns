package com.shengmingji.strategypattern;

/**
 * Created by dell on 2017/12/28.
 */

public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return km*2;
    }
}
