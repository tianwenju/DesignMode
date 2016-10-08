package com.delta.ams.proxypattern.dyNamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public class InvocationHandlerImp implements InvocationHandler {

    private Object mObject;

    public InvocationHandlerImp(Object mObject) {
        this.mObject = mObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(mObject,args);
        System.out.println(""+proxy.getClass().getName()+mObject.getClass().getName());
        return  result;
    }
}
