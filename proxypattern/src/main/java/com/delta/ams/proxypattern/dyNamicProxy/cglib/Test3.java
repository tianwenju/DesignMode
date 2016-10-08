package com.delta.ams.proxypattern.dyNamicProxy.cglib;

import com.delta.ams.proxypattern.ISeller;
import com.delta.ams.proxypattern.xiaoming;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Method;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public class Test3 {
    public static void main(String[] args) {
        xiaoming mXiaoming = new xiaoming();
        Enhancer mEnhancer = new Enhancer();
        mEnhancer.setSuperclass(mXiaoming.getClass());
        mEnhancer.setCallbacks(new Callback[]{new MyIntercepter(0),NoOp.INSTANCE});
        mEnhancer.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {

                if(method.getName().equalsIgnoreCase("sellHouse")){

                    System.out.println("房子已经卖了"+method.getName());
                    return 1;
                }
                    return 0;

            }
        });
        //生成的类是xiaoming的子类
        ISeller seller= (ISeller) mEnhancer.create();
        seller.sellHouse();
        seller.sellCar();

    }
}
