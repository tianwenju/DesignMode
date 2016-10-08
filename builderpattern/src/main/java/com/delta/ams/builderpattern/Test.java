package com.delta.ams.builderpattern;

/**
 * Created by V.Wenju.Tian on 2016/10/8.
 */
public class Test {

    public static void main(String[] args) {

        MacbookBuilder mMacbookBuilder = new MacbookBuilder();
        String a= mMacbookBuilder.setPower("sdf").setDisplay("0000").create().toString();
        System.out.println(a);
        XiaoMiComputer.Builder mBuilder = new XiaoMiComputer.Builder();
       String b= mBuilder.setName("ssf").setPrice(22).build().toString();
        System.out.println(""+b);


    }
}
