package com.shengmingji.strategypattern;


import org.junit.Test;

public class PriceCalculator {
    //公交车类型
    private static final int BUS = 1;
    //地铁类型
    private static final int SUBWAY = 2;
    //出租车类型
    private static final int TAXI = 3;

    @Test
    public void main() {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("坐16km的公交价格为:" + calculator.calculatePrice(16, SUBWAY));
    }

    /**
     * 公交车 十公里内一元，超过十公里之后每加一元可以乘5公里
     *
     * @param km
     * @return
     */
    private int busPrice(int km) {
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

    /**
     * 6公里(含) 内3元：6-12公里(含) 4元。12-22公里(含) 5元，22-32公里(含) 6元
     *
     * @return
     */
    private int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km <= 12) {
            return 4;
        } else if (km > 12 && km <= 22) {
            return 5;
        } else if (km > 22 && km <= 32) {
            return 6;
        }
        return 7;
    }

    /**
     * 出租车价格
     * @param km
     * @return
     */
    private int taxiPrice(int km) {
        return km * 2;

    }

    int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else if (type == SUBWAY) {
            return subwayPrice(km);
        }else if(type==TAXI){
            return taxiPrice(km);
        }
        return 0;
    }
}
