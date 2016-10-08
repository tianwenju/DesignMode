package com.delta.ams.builderpattern;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public class XiaoMiComputer {
    private String name;
    private int price;

    private XiaoMiComputer(Builder mBuilder) {
        name = mBuilder.name;
        price = mBuilder.price;
    }

    public static class Builder {
        private String name;
        private int price;

        public Builder() {
        }

        public Builder setName(String mName) {
            name = mName;
            return this;
        }

        public Builder setPrice(int mPrice) {
            price = mPrice;
            return this;
        }

        public XiaoMiComputer build() {

            return new XiaoMiComputer(this);
        }

    }

    @Override
    public String toString() {
        return "XiaoMiComputer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
