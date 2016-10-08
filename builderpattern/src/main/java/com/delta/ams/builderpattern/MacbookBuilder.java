package com.delta.ams.builderpattern;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public class MacbookBuilder implements Builder {
    public MacbookBuilder() {
        mComputer = new Computer();
    }

    private Computer mComputer;

    @Override
    public Builder setDisplay(String mDisplay) {

        mComputer.setDisplay(mDisplay);
        return this;

    }

    @Override
    public Builder setOs(String mOs) {

        mComputer.setOs(mOs);
        return this;
    }

    @Override
    public Builder setPower(String mPower) {

        mComputer.setPower(mPower);
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
