package com.delta.ams.builderpattern;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public   class Computer {
    protected  String powerName;
    protected  String displayName;
    protected  String osName;
    void setPower(String mPowerName) {
        this.powerName =mPowerName;
    }
    void setDisplay(String mDisplayName){
        this.displayName = mDisplayName;
    }

    public void setOs(String mOsName) {
        osName = mOsName;
    }

    @Override
    public String toString() {

        return "Computer{" +
                "powerName='" + powerName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", osName='" + osName + '\'' +
                '}';
    }
}
