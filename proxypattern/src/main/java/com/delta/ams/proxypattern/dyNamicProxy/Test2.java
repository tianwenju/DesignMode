package com.delta.ams.proxypattern.dyNamicProxy;

import com.delta.ams.proxypattern.ISeller;
import com.delta.ams.proxypattern.Ibuy;
import com.delta.ams.proxypattern.xiaoming;

import java.lang.reflect.Proxy;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 *
 * 特点：所要代理的类与代理类的接口是一致的
 * 调用代理类中的方法时，代理对象会触发InvocationHandler中的invoke()方法
 * 即：将执行功能的权利交给了InvocationHandelr,而InvocationHandler又通过Method参数，来具体区分是什么方法而作相应的处理
 * */
public class Test2 {
    public static void main(String[] args) {

        xiaoming mXiaoming = new xiaoming();
        ClassLoader mClassLoader = mXiaoming.getClass().getClassLoader();
        Class<?>[] mInterfaces = mXiaoming.getClass().getInterfaces();
        ISeller mSeller = (ISeller) Proxy.newProxyInstance(mClassLoader, mInterfaces, new InvocationHandlerImp(mXiaoming));
        mSeller.sellHouse();
        Ibuy buy = (Ibuy) Proxy.newProxyInstance(mClassLoader, mInterfaces, new InvocationHandlerImp(mXiaoming));
        buy.buy("qiche");
        //来了个需求是 小明的身份信息是123才是卖家才可以卖房子


    }
}
