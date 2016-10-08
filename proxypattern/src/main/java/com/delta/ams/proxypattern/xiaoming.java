package com.delta.ams.proxypattern;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public class xiaoming implements ISeller,Ibuy {
    @Override
    public void sellHouse() {

        System.out.println("小明的房子要卖");
    }

    @Override
    public void sellCar() {
        System.out.println("小明的车要卖");
    }

    @Override
    public void buy(String name) {
        System.out.println("小明买了"+name);
    }
}
