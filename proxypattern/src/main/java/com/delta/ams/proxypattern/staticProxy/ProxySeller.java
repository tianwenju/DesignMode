package com.delta.ams.proxypattern.staticProxy;
import com.delta.ams.proxypattern.ISeller;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 * 静态代理 知道要代理的对象是谁
 */
public class ProxySeller implements ISeller {


    private ISeller mISeller;

    public ProxySeller(ISeller mISeller) {
        this.mISeller = mISeller;
    }


    @Override
    public void sellHouse() {

    }

    @Override
    public void sellCar() {

    }
}
