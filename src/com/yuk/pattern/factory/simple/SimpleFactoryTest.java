package com.yuk.pattern.factory.simple;

import com.yuk.pattern.factory.Telunsu;

/**
 * Created by yuk on 2018/10/2.
 */
public class SimpleFactoryTest {
    //快捷键 psvm 、 sout
    public static void main(String[] args) {
        //有了工厂就不用自己 new 了
        //System.out.println(new Telunsu().getName());

        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMilk("特仑苏"));
    }
}
