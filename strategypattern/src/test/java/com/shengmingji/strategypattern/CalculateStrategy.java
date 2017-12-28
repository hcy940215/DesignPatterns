package com.shengmingji.strategypattern;

/**
 * Created by dell on 2017/12/28.
 */

public interface CalculateStrategy {
    /**
     * 按照距离计算价格
     * @param km
     * @return
     */
    int calculatePrice(int km);
}
