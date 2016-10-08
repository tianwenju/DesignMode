package com.delta.ams.proxypattern.dyNamicProxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public class MyIntercepter implements MethodInterceptor {

    private int id;

    public MyIntercepter(int mId) {
        id = mId;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("" + obj.getClass().getName());
        if (id == 123) {

            return proxy.invokeSuper(obj, args);
        }
        return null;

    }
}
