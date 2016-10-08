package com.delta.ams.proxypattern.staticProxy;

import com.delta.ams.proxypattern.ISeller;
import com.delta.ams.proxypattern.xiaoming;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public class Test1 {
    public static void main(String[] args) {
        ISeller mISeller = new xiaoming();
        ProxySeller mProxySeller = new ProxySeller(mISeller);
        mProxySeller.sellHouse();
    }
}

class Loader extends ClassLoader {
    public Class<?> defineLoader(byte[] b, int off, int len) {
        return super.defineClass(b, off, len);
    }

}

