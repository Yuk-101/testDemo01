package com.yuk.pattern.factory.abstr;

/**
 * Created by yuk on 2018/10/3.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        MilkFactory factory = new MilkFactory();
        System.out.println(factory.getMengniu());

    }
}
