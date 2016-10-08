package com.delta.ams.builderpattern;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public interface Builder {
    abstract Builder setDisplay(String mDisplay);
    abstract  Builder setOs(String  mOs);
    abstract  Builder setPower(String  mPower);
    abstract  Computer create();
}
